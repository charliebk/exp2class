class IfcRelAssignsToGroup(IfcRelAssigns):
    def __init__(self):
        self.RelatingGroup: IfcGroup = None

    # === EXTENDED BY ===
    # IfcRelAssignsToGroupByFactor

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0
