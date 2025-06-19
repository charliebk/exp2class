package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcShapeAspect {

    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcLogical ProductDefinitional;
    public IfcProductRepresentationSelect PartOfProductDefinitionShape; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;
}
