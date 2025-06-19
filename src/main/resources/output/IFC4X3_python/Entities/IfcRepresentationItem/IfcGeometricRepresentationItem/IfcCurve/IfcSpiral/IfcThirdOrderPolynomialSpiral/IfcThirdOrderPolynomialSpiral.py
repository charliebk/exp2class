class IfcThirdOrderPolynomialSpiral(IfcSpiral):
    def __init__(self):
        self.CubicTerm: IfcLengthMeasure = None
        self.QuadraticTerm: IfcLengthMeasure = None
        self.LinearTerm: IfcLengthMeasure = None
        self.ConstantTerm: IfcLengthMeasure = None
