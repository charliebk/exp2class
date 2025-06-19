class IfcPropertySetDefinition(IfcPropertyDefinition):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcPreDefinedPropertySet
    # IfcPropertySet
    # IfcQuantitySet

    # === INVERSE CLAUSES ===
    # DefinesType : SET [0:?] OF IfcTypeObject FOR HasPropertySets
    # IsDefinedBy : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatedPropertySets
    # DefinesOccurrence : SET [0:?] OF IfcRelDefinesByProperties FOR RelatingPropertyDefinition
