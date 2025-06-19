class IfcExtrudedAreaSolid(IfcSweptAreaSolid):
    def __init__(self):
        self.ExtrudedDirection: IfcDirection = None
        self.Depth: IfcPositiveLengthMeasure = None

    # === EXTENDED BY ===
    # IfcExtrudedAreaSolidTapered

    # === WHERE CLAUSES ===
    # ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0
