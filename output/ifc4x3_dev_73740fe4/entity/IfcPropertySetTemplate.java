package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcPropertySetTemplate extends IfcPropertyTemplateDefinition {

    public IfcPropertySetTemplateTypeEnum TemplateType; // OPTIONAL
    public IfcIdentifier ApplicableEntity; // OPTIONAL
    // INVERSE attributes:
    // Defines : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatingTemplate;
    // INVERSE attributes:
    // ExistsName : EXISTS(SELF\IfcRoot.Name);
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates);

    // WHERE constraints:
    // ExistsName : EXISTS(SELF\IfcRoot.Name);
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates);
}
