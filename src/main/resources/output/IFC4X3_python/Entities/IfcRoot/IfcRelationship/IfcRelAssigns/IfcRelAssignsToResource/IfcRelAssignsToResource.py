class IfcRelAssignsToResource(IfcRelAssigns):
    def __init__(self):
        self.RelatingResource: IfcResourceSelect = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingResource :=: Temp)) = 0
