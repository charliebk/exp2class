class IfcFaceBound(IfcTopologicalRepresentationItem):
    def __init__(self):
        self.Bound: IfcLoop = None
        self.Orientation: IfcBoolean = None

    # === EXTENDED BY ===
    # IfcFaceOuterBound
