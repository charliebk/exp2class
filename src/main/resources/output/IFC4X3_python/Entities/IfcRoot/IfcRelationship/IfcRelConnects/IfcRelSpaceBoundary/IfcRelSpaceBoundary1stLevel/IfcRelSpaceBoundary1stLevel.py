class IfcRelSpaceBoundary1stLevel(IfcRelSpaceBoundary):
    def __init__(self):
        self.ParentBoundary: IfcRelSpaceBoundary1stLevel = None

    # === EXTENDED BY ===
    # IfcRelSpaceBoundary2ndLevel

    # === INVERSE CLAUSES ===
    # InnerBoundaries : SET [0:?] OF IfcRelSpaceBoundary1stLevel FOR ParentBoundary
