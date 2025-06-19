package com.topoplanet;

import com.topoplanet.ParseBlock.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExpParser {



    public static List<ParsedBlockRaw> parseBloquesFromResource(String resourceName) throws IOException {
        try (InputStream inputStream = ExpParser.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (inputStream == null) {
                throw new FileNotFoundException("Archivo no encontrado en resources: " + resourceName);
            }
            List<String> lines = new BufferedReader(new InputStreamReader(inputStream)).lines().toList();
            List<ParsedBlockRaw> blocks = ExpParser.extractBlocks(lines);

            for (ParsedBlockRaw b : blocks) {
                System.out.println("Tipo: " + b.getType() + " Nombre: " + b.getName());
                System.out.println("Contenido: " + String.join("\n", b.getContent()));
                System.out.println("----------");
            }
            return blocks;
        }
    }
    public static List<ParsedBlockRaw> parseBloquesFromFile(Path path) throws IOException {
        if (!Files.exists(path)) {
            throw new FileNotFoundException("Archivo no encontrado: " + path.toAbsolutePath());
        }

        List<String> lines = Files.readAllLines(path);
        List<ParsedBlockRaw> blocks = ExpParser.extractBlocks(lines);

        for (ParsedBlockRaw b : blocks) {
            System.out.println("Tipo: " + b.getType() + " Nombre: " + b.getName());
            System.out.println("Contenido: " + String.join("\n", b.getContent()));
            System.out.println("----------");
        }

        return blocks;
    }
    public static List<ParsedBlockRaw> extractBlocks(List<String> lines) {
        List<ParsedBlockRaw> blocks = new ArrayList<>();
        List<String> currentContent = null;
        String currentType = null;
        String currentName = null;

        Pattern patternStart = Pattern.compile("^(SCHEMA|ENTITY|TYPE|FUNCTION|RULE|PROCEDURE|CONSTANT)\\s+(\\w+)", Pattern.CASE_INSENSITIVE);
        Pattern patternEnd = Pattern.compile("^END_\\w+\\s*;", Pattern.CASE_INSENSITIVE);

        for (String line : lines) {
            String trimmed = line.trim();
            Matcher startMatcher = patternStart.matcher(trimmed);

            // Detectar inicio de bloque
            if (startMatcher.find()) {
                currentType = startMatcher.group(1).toUpperCase();
                currentName = startMatcher.group(2);
                currentContent = new ArrayList<>();
                currentContent.add(trimmed);

                if ("SCHEMA".equals(currentType)) {
                    ParsedBlockRaw block = ParsedBlockFactory.create(currentType, currentName, currentContent);
                    blocks.add(block);
                }

                continue;
            }

            // Continuar acumulando contenido del bloque
            if (currentContent != null) {
                currentContent.add(trimmed);

                // Detectar fin de bloque
                if (patternEnd.matcher(trimmed).find()) {
                    ParsedBlockRaw block = ParsedBlockFactory.create(currentType, currentName, currentContent);
                    blocks.add(block);

                    // Reiniciar variables
                    currentContent = null;
                    currentType = null;
                    currentName = null;
                }
            }
        }

        return blocks;
    }

    public static String toJavaType(String type) {
        if (type.toUpperCase().contains("OPTIONAL")) {
            type = type.replace("OPTIONAL", "").trim();
        }

        if (type.startsWith("LIST")) {
            int idx = type.indexOf("OF");
            String inner = type.substring(idx + 2).trim();
            return "List<" + toJavaType(inner) + ">";
        }

        // Puedes mejorar este mapeo con lógica más completa
        return switch (type) {
            case "STRING", "BINARY" -> "String";
            case "REAL", "NUMBER", "DOUBLE", "FLOAT" -> "Double";
            case "INTEGER" -> "Integer";
            case "BOOLEAN", "LOGICAL" -> "Boolean";
            default -> type; // Asume que es una clase
        };
    }
    public static String toCSharpType(String type) {
        if (type.toUpperCase().contains("OPTIONAL")) {
            type = type.replace("OPTIONAL", "").trim();
        }

        if (type.startsWith("LIST")) {
            int idx = type.indexOf("OF");
            String inner = type.substring(idx + 2).trim();
            return "List<" + toCSharpType(inner) + ">";
        }

        return switch (type.toUpperCase()) {
            case "STRING", "BINARY" -> "string";
            case "REAL", "NUMBER", "DOUBLE", "FLOAT" -> "double";
            case "INTEGER" -> "int";
            case "BOOLEAN", "LOGICAL" -> "bool";
            default -> type; // Asume clase o tipo definido
        };
    }
    public static String toVBNetType(String type) {
        if (type.toUpperCase().contains("OPTIONAL")) {
            type = type.replace("OPTIONAL", "").trim();
        }

        if (type.startsWith("LIST")) {
            int idx = type.indexOf("OF");
            String inner = type.substring(idx + 2).trim();
            return "List(Of " + toVBNetType(inner) + ")";
        }

        return switch (type.toUpperCase()) {
            case "STRING", "BINARY" -> "String";
            case "REAL", "NUMBER", "DOUBLE", "FLOAT" -> "Double";
            case "INTEGER" -> "Integer";
            case "BOOLEAN", "LOGICAL" -> "Boolean";
            default -> type;
        };
    }
    public static String toPythonType(String type) {
        if (type.toUpperCase().contains("OPTIONAL")) {
            type = type.replace("OPTIONAL", "").trim();
        }

        if (type.startsWith("LIST")) {
            int idx = type.indexOf("OF");
            String inner = type.substring(idx + 2).trim();
            return "List[" + toPythonType(inner) + "]";
        }

        return switch (type.toUpperCase()) {
            case "STRING", "BINARY" -> "str";
            case "REAL", "NUMBER", "DOUBLE", "FLOAT" -> "float";
            case "INTEGER" -> "int";
            case "BOOLEAN", "LOGICAL" -> "bool";
            default -> type; // Asume que es una clase IFC u otro tipo definido
        };
    }
    public static String toJSType(String type) {
        type = type.toUpperCase();

        if (type.contains("OPTIONAL")) {
            type = type.replace("OPTIONAL", "").trim();
        }

        if (type.startsWith("LIST")) {
            int idx = type.indexOf("OF");
            String inner = type.substring(idx + 2).trim();
            return toJSType(inner) + "[]"; // Representa como array
        }

        return switch (type) {
            case "STRING", "BINARY" -> "string";
            case "REAL", "NUMBER", "DOUBLE", "FLOAT" -> "number";
            case "INTEGER" -> "number";
            case "BOOLEAN", "LOGICAL" -> "boolean";
            default -> type; // Asume que es una clase (IfcX)
        };
    }

    public static void exportAllFiles(
            List<ParsedBlockRaw> parsedBlocks,
            ExportFiles.Language language,
            Path outputPath,
            String rootFolderName) {

        Path root = outputPath.resolve(rootFolderName);
        Path enumsPath = root.resolve("Enums");
        Path typesPath = root.resolve("Types");
        Path entitiesPath = root.resolve("Entities");

        try {
            Files.createDirectories(enumsPath);
            Files.createDirectories(typesPath);
            Files.createDirectories(entitiesPath);
        } catch (IOException e) {
            throw new RuntimeException("Error creando carpetas base", e);
        }

        // === Enums ===
        parsedBlocks.stream()
                .filter(b -> b instanceof ParsedTypeRaw t && t.getIfcType() == ParsedTypeRaw.IfcTypeBlock.ENUM)
                .forEach(b -> writeBlockToFolder(b, enumsPath, language));

        // === Types (no enums) ===
        parsedBlocks.stream()
                .filter(b -> b instanceof ParsedTypeRaw t && t.getIfcType() != ParsedTypeRaw.IfcTypeBlock.ENUM)
                .forEach(b -> writeBlockToFolder(b, typesPath, language));

        // === Entities ===
        List<ParsedEntityRaw> allEntities = parsedBlocks.stream()
                .filter(b -> b instanceof ParsedEntityRaw)
                .map(b -> (ParsedEntityRaw) b)
                .toList();

        Map<String, Path> entityPaths = new HashMap<>();
        Set<ParsedEntityRaw> pending = new HashSet<>(allEntities);
        boolean progress;

        do {
            progress = false;
            Iterator<ParsedEntityRaw> it = pending.iterator();

            while (it.hasNext()) {
                ParsedEntityRaw entity = it.next();
                String parent = entity.getSubtype();

                Path targetFolder;

                // Si no tiene padre, lo creamos en la carpeta raíz
                if (parent == null || parent.isEmpty()) {
                    targetFolder = entitiesPath.resolve(entity.getName());
                }
                // Si su padre ya tiene carpeta, se anida dentro
                else if (entityPaths.containsKey(parent)) {
                    targetFolder = entityPaths.get(parent).resolve(entity.getName());
                } else {
                    continue; // No podemos procesarlo todavía
                }

                // Creamos carpeta y exportamos
                createAndExportEntity(entity, targetFolder, language);
                entityPaths.put(entity.getName(), targetFolder);
                it.remove(); // lo quitamos de pendientes
                progress = true;
            }

        } while (!pending.isEmpty() && progress);

        // Reporte final si quedó algo sin procesar
        if (!pending.isEmpty()) {
            System.err.println("❌ Las siguientes entidades no pudieron exportarse:");
            for (ParsedEntityRaw e : pending) {
                System.err.println(" - " + e.getName() + " (subtipo de " + e.getSubtype() + ")");
            }
        }
    }



    private static void createAndExportEntity(ParsedEntityRaw entity, Path folder, ExportFiles.Language lang) {
        try {
            Files.createDirectories(folder);
            Path file = folder.resolve(entity.getName() + getFileExtension(lang));
            Files.writeString(file, entity.exportFile(lang).toString());
        } catch (IOException e) {
            throw new RuntimeException("Error exportando entidad " + entity.getName(), e);
        }
    }

    private static void writeBlockToFolder(ParsedBlockRaw block, Path folder, ExportFiles.Language lang) {
        try {
            Files.createDirectories(folder);
            Path file = folder.resolve(block.getName() + getFileExtension(lang));
            Files.writeString(file, block.exportFile(lang).toString());
        } catch (IOException e) {
            throw new RuntimeException("Error exportando bloque " + block.getName(), e);
        }
    }

    private static String getFileExtension(ExportFiles.Language lang) {
        return switch (lang) {
            case JAVA -> ".java";
            case CSHARP -> ".cs";
            case PYTHON -> ".py";
            case VBNET -> ".vb";
            case JS -> ".js";
        };
    }

}
