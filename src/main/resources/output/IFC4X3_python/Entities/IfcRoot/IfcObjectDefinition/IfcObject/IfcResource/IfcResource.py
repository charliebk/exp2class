class IfcResource(IfcObject):
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.LongDescription: IfcText = None

    # === EXTENDED BY ===
    # IfcConstructionResource

    # === INVERSE CLAUSES ===
    # ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
