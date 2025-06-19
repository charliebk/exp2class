class IfcLightSourcePositional(IfcLightSource):
    def __init__(self):
        self.Position: IfcCartesianPoint = None
        self.Radius: IfcPositiveLengthMeasure = None
        self.ConstantAttenuation: IfcReal = None
        self.DistanceAttenuation: IfcReal = None
        self.QuadricAttenuation: IfcReal = None

    # === EXTENDED BY ===
    # IfcLightSourceSpot
