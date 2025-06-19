class IfcRoot:
    def __init__(self):
        self.GlobalId: IfcGloballyUniqueId = None
        self.OwnerHistory: IfcOwnerHistory = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None

    # === EXTENDED BY ===
    # IfcObjectDefinition
    # IfcPropertyDefinition
    # IfcRelationship

    # === UNIQUE CLAUSES ===
    # UR1 : GlobalId
