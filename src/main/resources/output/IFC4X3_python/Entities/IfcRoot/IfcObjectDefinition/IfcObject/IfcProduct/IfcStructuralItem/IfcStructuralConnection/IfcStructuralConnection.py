class IfcStructuralConnection(IfcStructuralItem):
    def __init__(self):
        self.AppliedCondition: IfcBoundaryCondition = None

    # === EXTENDED BY ===
    # IfcStructuralCurveConnection
    # IfcStructuralPointConnection
    # IfcStructuralSurfaceConnection

    # === INVERSE CLAUSES ===
    # ConnectsStructuralMembers : SET [1:?] OF IfcRelConnectsStructuralMember FOR RelatedStructuralConnection
