class IfcSurfaceOfLinearExtrusion(IfcSweptSurface):
    def __init__(self):
        self.ExtrudedDirection: IfcDirection = None
        self.Depth: IfcLengthMeasure = None

    # === WHERE CLAUSES ===
    # DepthGreaterZero : Depth > 0.

    # === DERIVE CLAUSES ===
    # ExtrusionAxis : IfcVector := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector (ExtrudedDirection, Depth)
