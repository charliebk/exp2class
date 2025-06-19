package com.topoplanet.ParseBlock;

import java.util.List;

public class ParsedFunctionRaw extends ParsedBlockRaw{
    public ParsedFunctionRaw(String name, List<String> content) {
        super(name, content);
    }

    @Override
    public String getType() {
        return "FUNCTION";
    }

    @Override
    public StringBuilder exportFile(ExportFiles.Language language) {
        return switch (language) {
            case JAVA -> exportAsJava();
            case CSHARP -> exportAsCSharp();
            case PYTHON -> exportAsPython();
            case VBNET, JS -> new StringBuilder("// Not implemented for " + language);
        };
    }

    private StringBuilder exportAsJava() {
        StringBuilder sb = new StringBuilder();
        return sb;
    }
    private StringBuilder exportAsCSharp(){
        StringBuilder sb = new StringBuilder();
        return sb;
    }
    private StringBuilder exportAsPython(){
        StringBuilder sb = new StringBuilder();
        return sb;
    }
}
