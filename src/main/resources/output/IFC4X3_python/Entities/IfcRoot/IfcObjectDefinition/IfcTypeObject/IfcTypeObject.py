class IfcTypeObject(IfcObjectDefinition):
    def __init__(self):
        self.ApplicableOccurrence: IfcIdentifier = None
        self.HasPropertySets: SET [1:?] OF IfcPropertySetDefinition = None

    # === EXTENDED BY ===
    # IfcTypeProcess
    # IfcTypeProduct
    # IfcTypeResource

    # === INVERSE CLAUSES ===
    # Types : SET [0:1] OF IfcRelDefinesByType FOR RelatingType

    # === WHERE CLAUSES ===
    # NameRequired : EXISTS(SELF\IfcRoot.Name)
    # UniquePropertySetNames : (NOT(EXISTS(HasPropertySets))) OR IfcUniquePropertySetNames(HasPropertySets)
