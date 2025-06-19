package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcTypeObject extends IfcObjectDefinition {

    public IfcIdentifier ApplicableOccurrence; // OPTIONAL
    // INVERSE attributes:
    // Types : SET [0:1] OF IfcRelDefinesByType FOR RelatingType;
    // INVERSE attributes:
    // NameRequired : EXISTS(SELF\IfcRoot.Name);
    // UniquePropertySetNames : (NOT(EXISTS(HasPropertySets))) OR IfcUniquePropertySetNames(HasPropertySets);

    // SUPERTYPE OF:
    // - IfcTypeProcess
    // - IfcTypeProduct
    // - IfcTypeResource SUBTYPE OF IfcObjectDefinition

    // WHERE constraints:
    // NameRequired : EXISTS(SELF\IfcRoot.Name);
    // UniquePropertySetNames : (NOT(EXISTS(HasPropertySets))) OR IfcUniquePropertySetNames(HasPropertySets);
}
