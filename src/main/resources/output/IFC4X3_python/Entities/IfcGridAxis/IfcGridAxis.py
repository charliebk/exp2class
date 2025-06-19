class IfcGridAxis:
    def __init__(self):
        self.AxisTag: IfcLabel = None
        self.AxisCurve: IfcCurve = None
        self.SameSense: IfcBoolean = None

    # === INVERSE CLAUSES ===
    # PartOfW : SET [0:1] OF IfcGrid FOR WAxes
    # PartOfV : SET [0:1] OF IfcGrid FOR VAxes
    # PartOfU : SET [0:1] OF IfcGrid FOR UAxes
    # HasIntersections : SET [0:?] OF IfcVirtualGridIntersection FOR IntersectingAxes

    # === WHERE CLAUSES ===
    # WR1 : AxisCurve.Dim = 2
    # WR2 : (SIZEOF(PartOfU) = 1) XOR (SIZEOF(PartOfV) = 1) XOR (SIZEOF(PartOfW) = 1)
