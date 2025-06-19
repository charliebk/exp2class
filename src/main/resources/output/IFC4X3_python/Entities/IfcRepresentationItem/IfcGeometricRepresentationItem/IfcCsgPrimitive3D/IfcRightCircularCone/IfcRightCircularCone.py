class IfcRightCircularCone(IfcCsgPrimitive3D):
    def __init__(self):
        self.Height: IfcPositiveLengthMeasure = None
        self.BottomRadius: IfcPositiveLengthMeasure = None
