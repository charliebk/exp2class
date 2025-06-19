package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcPropertyTemplate extends IfcPropertyTemplateDefinition {

    // INVERSE attributes:
    // PartOfComplexTemplate : SET [0:?] OF IfcComplexPropertyTemplate FOR HasPropertyTemplates;
    // PartOfPsetTemplate : SET [0:?] OF IfcPropertySetTemplate FOR HasPropertyTemplates;

    // SUPERTYPE OF:
    // - IfcComplexPropertyTemplate
    // - IfcSimplePropertyTemplate SUBTYPE OF IfcPropertyTemplateDefinition
}
