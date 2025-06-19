package com.topoplanet.ParseBlock;
import java.util.List;

public abstract class ParsedBlockRaw {
    protected final String name;
    protected final List<String> content;

    public ParsedBlockRaw(String name, List<String> content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public List<String> getContent() {
        return content;
    }

    public abstract String getType(); // ENTITY, TYPE, FUNCTION, ...
    public abstract StringBuilder exportFile(ExportFiles.Language language);
}
