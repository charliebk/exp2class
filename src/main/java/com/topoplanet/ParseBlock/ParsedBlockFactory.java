package com.topoplanet.ParseBlock;

import java.util.List;

public class ParsedBlockFactory {
    public static ParsedBlockRaw create(String type, String name, List<String> content) {
        return switch (type.toUpperCase()) {
            case "SCHEMA" -> new ParsedSchemaRaw(name, content);
            case "ENTITY" -> new ParsedEntityRaw(name, content);
            case "TYPE" -> new ParsedTypeRaw(name, content);
            case "FUNCTION" -> new ParsedFunctionRaw(name, content);
            case "RULE" -> new ParsedRuleRaw(name, content);
            case "PROCEDURE" -> new ParsedLocalRaw(name, content);
            case "CONSTANT" -> new ParsedConstantRaw(name, content);
            default -> throw new IllegalArgumentException("Tipo de bloque no reconocido: " + type);
        };
    }
}
