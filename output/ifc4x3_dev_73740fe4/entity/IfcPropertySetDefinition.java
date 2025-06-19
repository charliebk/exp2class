package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcPropertySetDefinition extends IfcPropertyDefinition {

    // INVERSE attributes:
    // DefinesType : SET [0:?] OF IfcTypeObject FOR HasPropertySets;
    // IsDefinedBy : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatedPropertySets;
    // DefinesOccurrence : SET [0:?] OF IfcRelDefinesByProperties FOR RelatingPropertyDefinition;

    // SUPERTYPE OF:
    // - IfcPreDefinedPropertySet
    // - IfcPropertySet
    // - IfcQuantitySet SUBTYPE OF IfcPropertyDefinition
}
