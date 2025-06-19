package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcClassificationReference extends IfcExternalReference {

    public IfcClassificationReferenceSelect ReferencedSource; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcIdentifier Sort; // OPTIONAL
    // INVERSE attributes:
    // ClassificationRefForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification;
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource;
}
