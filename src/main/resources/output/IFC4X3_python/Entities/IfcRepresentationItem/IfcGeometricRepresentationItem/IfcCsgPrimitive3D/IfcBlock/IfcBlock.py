class IfcBlock(IfcCsgPrimitive3D):
    def __init__(self):
        self.XLength: IfcPositiveLengthMeasure = None
        self.YLength: IfcPositiveLengthMeasure = None
        self.ZLength: IfcPositiveLengthMeasure = None
