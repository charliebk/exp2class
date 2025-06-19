class IfcCosineSpiral(IfcSpiral):
    def __init__(self):
        self.CosineTerm: IfcLengthMeasure = None
        self.ConstantTerm: IfcLengthMeasure = None
