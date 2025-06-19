package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcObject extends IfcObjectDefinition {

    public IfcLabel ObjectType; // OPTIONAL
    // INVERSE attributes:
    // IsDeclaredBy : SET [0:1] OF IfcRelDefinesByObject FOR RelatedObjects;
    // Declares : SET [0:?] OF IfcRelDefinesByObject FOR RelatingObject;
    // IsTypedBy : SET [0:1] OF IfcRelDefinesByType FOR RelatedObjects;
    // IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects;
    // INVERSE attributes:
    // UniquePropertySetNames : ((SIZEOF(IsDefinedBy) = 0) OR IfcUniqueDefinitionNames(IsDefinedBy));

    // SUPERTYPE OF:
    // - IfcActor
    // - IfcControl
    // - IfcGroup
    // - IfcProcess
    // - IfcProduct
    // - IfcResource SUBTYPE OF IfcObjectDefinition

    // WHERE constraints:
    // UniquePropertySetNames : ((SIZEOF(IsDefinedBy) = 0) OR IfcUniqueDefinitionNames(IsDefinedBy));
}
