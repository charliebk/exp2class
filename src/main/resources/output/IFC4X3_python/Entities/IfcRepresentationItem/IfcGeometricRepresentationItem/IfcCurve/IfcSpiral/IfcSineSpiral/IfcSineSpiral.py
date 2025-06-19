class IfcSineSpiral(IfcSpiral):
    def __init__(self):
        self.SineTerm: IfcLengthMeasure = None
        self.LinearTerm: IfcLengthMeasure = None
        self.ConstantTerm: IfcLengthMeasure = None
