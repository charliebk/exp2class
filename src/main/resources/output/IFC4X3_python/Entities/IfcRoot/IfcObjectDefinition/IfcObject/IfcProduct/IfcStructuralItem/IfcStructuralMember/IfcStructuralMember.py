class IfcStructuralMember(IfcStructuralItem):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcStructuralCurveMember
    # IfcStructuralSurfaceMember

    # === INVERSE CLAUSES ===
    # ConnectedBy : SET [0:?] OF IfcRelConnectsStructuralMember FOR RelatingStructuralMember
