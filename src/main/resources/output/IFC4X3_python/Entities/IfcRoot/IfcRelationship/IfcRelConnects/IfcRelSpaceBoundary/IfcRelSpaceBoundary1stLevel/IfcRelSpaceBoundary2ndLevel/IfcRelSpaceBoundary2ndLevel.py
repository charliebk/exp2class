class IfcRelSpaceBoundary2ndLevel(IfcRelSpaceBoundary1stLevel):
    def __init__(self):
        self.CorrespondingBoundary: IfcRelSpaceBoundary2ndLevel = None

    # === INVERSE CLAUSES ===
    # Corresponds : SET [0:1] OF IfcRelSpaceBoundary2ndLevel FOR CorrespondingBoundary
