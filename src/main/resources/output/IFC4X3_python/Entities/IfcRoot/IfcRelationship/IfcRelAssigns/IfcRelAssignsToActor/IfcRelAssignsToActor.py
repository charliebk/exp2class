class IfcRelAssignsToActor(IfcRelAssigns):
    def __init__(self):
        self.RelatingActor: IfcActor = None
        self.ActingRole: IfcActorRole = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0
