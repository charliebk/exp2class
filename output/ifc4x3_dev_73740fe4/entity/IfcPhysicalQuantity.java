package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcPhysicalQuantity {

    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;
    // PartOfComplex : SET [0:1] OF IfcPhysicalComplexQuantity FOR HasQuantities;

    // SUPERTYPE OF:
    // - IfcPhysicalComplexQuantity
    // - IfcPhysicalSimpleQuantity
}
