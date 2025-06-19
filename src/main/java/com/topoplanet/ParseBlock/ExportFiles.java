package com.topoplanet.ParseBlock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ExportFiles {

    public static void exportFiles(Language language, Path outputPath, List<ParsedBlockRaw> blocks) throws IOException {
        if (!Files.exists(outputPath)) {
            Files.createDirectories(outputPath);
        }

        for (ParsedBlockRaw block : blocks) {
            String className = block.getName();
            StringBuilder content = block.exportFile(language);

            if (content != null && !content.isEmpty()) {
                Path filePath = outputPath.resolve(className + getFileExtension(language));
                Files.writeString(filePath, content.toString());
            }
        }
    }

    private static String getFileExtension(Language lang) {
        return switch (lang) {
            case JAVA -> ".java";
            case CSHARP -> ".cs";
            case VBNET -> ".vb";
            case PYTHON -> ".py";
            case JS -> ".js";
        };
    }

    public enum Language {
        JAVA, CSHARP, VBNET, PYTHON, JS
    }
}

