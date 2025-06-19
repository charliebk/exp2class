package com.topoplanet;

import com.topoplanet.ParseBlock.ExportFiles;
import com.topoplanet.ParseBlock.ParsedBlockRaw;



import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            String expFileName = "IFC4X3_DEV_73740fe4.exp";
            List<ParsedBlockRaw> parsedBlockRaws = ExpParser.parseBloquesFromResource("IFC.exp");

            ExpParser.exportAllFiles(
                    parsedBlockRaws,
                    ExportFiles.Language.JAVA,
                    Path.of("C:\\Users\\carlos.gallardo\\Documents\\test"),
                    "IFC4X3"
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}