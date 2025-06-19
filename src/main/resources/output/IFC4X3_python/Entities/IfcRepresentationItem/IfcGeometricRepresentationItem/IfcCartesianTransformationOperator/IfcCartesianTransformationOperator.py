class IfcCartesianTransformationOperator(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Axis1: IfcDirection = None
        self.Axis2: IfcDirection = None
        self.LocalOrigin: IfcCartesianPoint = None
        self.Scale: IfcReal = None

    # === EXTENDED BY ===
    # IfcCartesianTransformationOperator2D
    # IfcCartesianTransformationOperator3D

    # === WHERE CLAUSES ===
    # ScaleGreaterZero : Scl > 0.0

    # === DERIVE CLAUSES ===
    # Scl : IfcReal := NVL(Scale, 1.0)
    # Dim : IfcDimensionCount := LocalOrigin.Dim
