class IfcRelAssignsToControl(IfcRelAssigns):
    def __init__(self):
        self.RelatingControl: IfcControl = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0
