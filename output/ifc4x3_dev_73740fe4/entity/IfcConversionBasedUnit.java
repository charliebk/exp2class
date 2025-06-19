package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcConversionBasedUnit extends IfcNamedUnit {

    public IfcLabel Name;
    public IfcMeasureWithUnit ConversionFactor;
    // INVERSE attributes:
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;

    // SUPERTYPE OF:
    // - IfcConversionBasedUnitWithOffset SUBTYPE OF IfcNamedUnit
}
