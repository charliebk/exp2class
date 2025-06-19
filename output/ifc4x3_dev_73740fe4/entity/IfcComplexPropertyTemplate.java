package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcComplexPropertyTemplate extends IfcPropertyTemplate {

    public IfcLabel UsageName; // OPTIONAL
    public IfcComplexPropertyTemplateTypeEnum TemplateType; // OPTIONAL
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0;
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates);

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0;
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates);
}
