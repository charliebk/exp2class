class IfcSeventhOrderPolynomialSpiral(IfcSpiral):
    def __init__(self):
        self.SepticTerm: IfcLengthMeasure = None
        self.SexticTerm: IfcLengthMeasure = None
        self.QuinticTerm: IfcLengthMeasure = None
        self.QuarticTerm: IfcLengthMeasure = None
        self.CubicTerm: IfcLengthMeasure = None
        self.QuadraticTerm: IfcLengthMeasure = None
        self.LinearTerm: IfcLengthMeasure = None
        self.ConstantTerm: IfcLengthMeasure = None
