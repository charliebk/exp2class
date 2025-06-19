class IfcComplexPropertyTemplate(IfcPropertyTemplate):
    def __init__(self):
        self.UsageName: IfcLabel = None
        self.TemplateType: IfcComplexPropertyTemplateTypeEnum = None
        self.HasPropertyTemplates: SET [1:?] OF IfcPropertyTemplate = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0
    # UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
