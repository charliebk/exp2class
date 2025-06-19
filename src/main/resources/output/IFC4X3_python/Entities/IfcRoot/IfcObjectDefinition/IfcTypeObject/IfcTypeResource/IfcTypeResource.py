class IfcTypeResource(IfcTypeObject):
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.LongDescription: IfcText = None
        self.ResourceType: IfcLabel = None

    # === EXTENDED BY ===
    # IfcConstructionResourceType

    # === INVERSE CLAUSES ===
    # ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
