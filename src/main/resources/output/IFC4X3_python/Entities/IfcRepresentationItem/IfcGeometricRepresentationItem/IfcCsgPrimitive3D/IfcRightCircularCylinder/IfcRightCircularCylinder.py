class IfcRightCircularCylinder(IfcCsgPrimitive3D):
    def __init__(self):
        self.Height: IfcPositiveLengthMeasure = None
        self.Radius: IfcPositiveLengthMeasure = None
