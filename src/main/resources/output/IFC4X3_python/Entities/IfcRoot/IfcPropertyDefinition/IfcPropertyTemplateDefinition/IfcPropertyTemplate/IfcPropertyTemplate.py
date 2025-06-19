class IfcPropertyTemplate(IfcPropertyTemplateDefinition):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcComplexPropertyTemplate
    # IfcSimplePropertyTemplate

    # === INVERSE CLAUSES ===
    # PartOfComplexTemplate : SET [0:?] OF IfcComplexPropertyTemplate FOR HasPropertyTemplates
    # PartOfPsetTemplate : SET [0:?] OF IfcPropertySetTemplate FOR HasPropertyTemplates
