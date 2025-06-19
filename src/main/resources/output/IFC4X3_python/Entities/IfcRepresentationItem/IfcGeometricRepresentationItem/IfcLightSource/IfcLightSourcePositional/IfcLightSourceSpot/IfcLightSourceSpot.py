class IfcLightSourceSpot(IfcLightSourcePositional):
    def __init__(self):
        self.Orientation: IfcDirection = None
        self.ConcentrationExponent: IfcReal = None
        self.SpreadAngle: IfcPositivePlaneAngleMeasure = None
        self.BeamWidthAngle: IfcPositivePlaneAngleMeasure = None
