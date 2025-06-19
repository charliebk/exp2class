package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcPropertyDefinition extends IfcRoot {

    // INVERSE attributes:
    // HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions;
    // HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects;

    // SUPERTYPE OF:
    // - IfcPropertySetDefinition
    // - IfcPropertyTemplateDefinition SUBTYPE OF IfcRoot
}
