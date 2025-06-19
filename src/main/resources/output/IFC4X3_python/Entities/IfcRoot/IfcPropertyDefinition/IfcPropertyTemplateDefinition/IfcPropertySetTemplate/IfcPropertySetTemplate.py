class IfcPropertySetTemplate(IfcPropertyTemplateDefinition):
    def __init__(self):
        self.TemplateType: IfcPropertySetTemplateTypeEnum = None
        self.ApplicableEntity: IfcIdentifier = None
        self.HasPropertyTemplates: SET [1:?] OF IfcPropertyTemplate = None

    # === INVERSE CLAUSES ===
    # Defines : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatingTemplate

    # === WHERE CLAUSES ===
    # ExistsName : EXISTS(SELF\IfcRoot.Name)
    # UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
