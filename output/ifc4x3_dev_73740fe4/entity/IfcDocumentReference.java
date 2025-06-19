package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcDocumentReference extends IfcExternalReference {

    public IfcText Description; // OPTIONAL
    public IfcDocumentInformation ReferencedDocument; // OPTIONAL
    // INVERSE attributes:
    // DocumentRefForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument;
    // INVERSE attributes:
    // WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument);

    // WHERE constraints:
    // WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument);
}
