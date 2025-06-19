class IfcCartesianTransformationOperator2DnonUniform(IfcCartesianTransformationOperator2D):
    def __init__(self):
        self.Scale2: IfcReal = None

    # === WHERE CLAUSES ===
    # Scale2GreaterZero : Scl2 > 0.0

    # === DERIVE CLAUSES ===
    # Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
