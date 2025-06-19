class IfcSweptSurface(IfcSurface):
    def __init__(self):
        self.SweptCurve: IfcProfileDef = None
        self.Position: IfcAxis2Placement3D = None

    # === EXTENDED BY ===
    # IfcSurfaceOfLinearExtrusion
    # IfcSurfaceOfRevolution

    # === WHERE CLAUSES ===
    # SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve
