class IfcPropertyDefinition(IfcRoot):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcPropertySetDefinition
    # IfcPropertyTemplateDefinition

    # === INVERSE CLAUSES ===
    # HasContext : SET [0:1] OF IfcRelDeclares FOR RelatedDefinitions
    # HasAssociations : SET [0:?] OF IfcRelAssociates FOR RelatedObjects
