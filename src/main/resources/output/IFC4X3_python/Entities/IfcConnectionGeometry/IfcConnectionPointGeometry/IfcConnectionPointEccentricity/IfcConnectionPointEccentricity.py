class IfcConnectionPointEccentricity(IfcConnectionPointGeometry):
    def __init__(self):
        self.EccentricityInX: IfcLengthMeasure = None
        self.EccentricityInY: IfcLengthMeasure = None
        self.EccentricityInZ: IfcLengthMeasure = None
