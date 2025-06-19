class IfcLocalPlacement(IfcObjectPlacement):
    def __init__(self):
        self.RelativePlacement: IfcAxis2Placement = None

    # === WHERE CLAUSES ===
    # WR21 : IfcCorrectLocalPlacement(RelativePlacement, PlacementRelTo)
