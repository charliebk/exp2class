package com.topoplanet;

import com.topoplanet.ParseBlock.ExportFiles;
import com.topoplanet.ParseBlock.ParsedBlockRaw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.topoplanet.ParseBlock.ExportFiles.Language.*;

public class Main {
        public static void main(String[] args) {

//            List<ParsedBlockRaw> parsedBlocks = null;
//            try {
//                parsedBlocks = ExpParser.parseBloquesFromResource("IFC.exp");
//                ExpParser.exportAllFiles(
//                        parsedBlocks,
//                        JS,
//                        Path.of("C:\\Users\\carlos.gallardo\\Documents\\test"),
//                        "IFC4X3_js"
//                );
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }



            if (args.length != 4) {
                System.out.println("""
                Uso correcto:
                    java -jar ExpParser.jar <archivo.exp> <lenguaje> <salida> <nombre_carpeta_root>

                Parámetros:
                    <archivo.exp>             Ruta al archivo IFC EXPRESS
                    <lenguaje>                Lenguaje de exportación: JAVA, CSHARP, PYTHON, VBNET, JS
                    <salida>                  Carpeta base donde se guardará la estructura
                    <nombre_carpeta_root>     Nombre de la carpeta raíz (ej. IFC4X3)
                """);
                return;
            }

            Path expPath = Paths.get(args[0]);
            String languageStr = args[1].toUpperCase();
            Path outputPath = Paths.get(args[2]);
            String rootFolderName = args[3];

            // Validación
            if (!Files.exists(expPath)) {
                System.err.println("Archivo .exp no encontrado: " + expPath);
                return;
            }

            ExportFiles.Language language;
            try {
                language = ExportFiles.Language.valueOf(languageStr);
            } catch (IllegalArgumentException e) {
                System.err.println("Lenguaje no soportado: " + languageStr);
                return;
            }

            try {
                List<ParsedBlockRaw> parsedBlocks = ExpParser.parseBloquesFromFile(expPath);
                ExpParser.exportAllFiles(parsedBlocks, language, outputPath, rootFolderName);
                System.out.println("Exportación completada con éxito.");
            } catch (Exception e) {
                System.err.println("Error al procesar el archivo:");
                e.printStackTrace();
            }
        }
    }

