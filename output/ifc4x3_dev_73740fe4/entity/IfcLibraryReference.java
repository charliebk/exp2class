package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcLibraryReference extends IfcExternalReference {

    public IfcText Description; // OPTIONAL
    public IfcLanguageId Language; // OPTIONAL
    public IfcLibraryInformation ReferencedLibrary; // OPTIONAL
    // INVERSE attributes:
    // LibraryRefForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary;
}
