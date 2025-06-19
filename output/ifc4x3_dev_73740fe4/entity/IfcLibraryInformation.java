package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcLibraryInformation extends IfcExternalInformation {

    public IfcLabel Name;
    public IfcLabel Version; // OPTIONAL
    public IfcActorSelect Publisher; // OPTIONAL
    public IfcDateTime VersionDate; // OPTIONAL
    public IfcURIReference Location; // OPTIONAL
    public IfcText Description; // OPTIONAL
    // INVERSE attributes:
    // LibraryInfoForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary;
    // HasLibraryReferences : SET [0:?] OF IfcLibraryReference FOR ReferencedLibrary;
}
