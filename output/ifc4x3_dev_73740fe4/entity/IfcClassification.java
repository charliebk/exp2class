package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcClassification extends IfcExternalInformation {

    public IfcLabel Source; // OPTIONAL
    public IfcLabel Edition; // OPTIONAL
    public IfcDate EditionDate; // OPTIONAL
    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    public IfcURIReference Specification; // OPTIONAL
    // INVERSE attributes:
    // ClassificationForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification;
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource;
}
