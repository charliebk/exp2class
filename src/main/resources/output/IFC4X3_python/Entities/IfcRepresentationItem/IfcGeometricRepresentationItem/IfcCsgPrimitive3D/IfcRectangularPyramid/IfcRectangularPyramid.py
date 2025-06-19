class IfcRectangularPyramid(IfcCsgPrimitive3D):
    def __init__(self):
        self.XLength: IfcPositiveLengthMeasure = None
        self.YLength: IfcPositiveLengthMeasure = None
        self.Height: IfcPositiveLengthMeasure = None
