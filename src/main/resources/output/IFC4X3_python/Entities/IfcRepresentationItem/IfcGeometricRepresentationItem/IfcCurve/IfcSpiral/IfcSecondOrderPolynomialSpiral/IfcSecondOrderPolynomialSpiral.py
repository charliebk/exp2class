class IfcSecondOrderPolynomialSpiral(IfcSpiral):
    def __init__(self):
        self.QuadraticTerm: IfcLengthMeasure = None
        self.LinearTerm: IfcLengthMeasure = None
        self.ConstantTerm: IfcLengthMeasure = None
