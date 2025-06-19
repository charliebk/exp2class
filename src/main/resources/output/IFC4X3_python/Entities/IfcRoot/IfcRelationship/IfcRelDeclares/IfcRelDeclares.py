class IfcRelDeclares(IfcRelationship):
    def __init__(self):
        self.RelatingContext: IfcContext = None
        self.RelatedDefinitions: SET [1:?] OF IfcDefinitionSelect = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0
