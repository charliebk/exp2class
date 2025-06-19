class IfcSurfaceOfRevolution(IfcSweptSurface):
    def __init__(self):
        self.AxisPosition: IfcAxis1Placement = None

    # === DERIVE CLAUSES ===
    # AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(AxisPosition.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(AxisPosition.Z,1.0))
