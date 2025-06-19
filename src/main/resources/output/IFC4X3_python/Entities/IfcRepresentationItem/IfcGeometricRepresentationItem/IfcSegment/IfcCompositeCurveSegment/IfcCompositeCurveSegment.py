class IfcCompositeCurveSegment(IfcSegment):
    def __init__(self):
        self.SameSense: IfcBoolean = None
        self.ParentCurve: IfcCurve = None

    # === EXTENDED BY ===
    # IfcReparametrisedCompositeCurveSegment

    # === WHERE CLAUSES ===
    # ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve))
