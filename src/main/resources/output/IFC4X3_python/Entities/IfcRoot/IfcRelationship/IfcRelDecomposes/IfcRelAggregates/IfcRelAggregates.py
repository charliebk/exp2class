class IfcRelAggregates(IfcRelDecomposes):
    def __init__(self):
        self.RelatingObject: IfcObjectDefinition = None
        self.RelatedObjects: SET [1:?] OF IfcObjectDefinition = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
