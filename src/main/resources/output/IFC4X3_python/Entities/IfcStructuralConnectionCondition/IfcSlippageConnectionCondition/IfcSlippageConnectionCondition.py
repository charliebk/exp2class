class IfcSlippageConnectionCondition(IfcStructuralConnectionCondition):
    def __init__(self):
        self.SlippageX: IfcLengthMeasure = None
        self.SlippageY: IfcLengthMeasure = None
        self.SlippageZ: IfcLengthMeasure = None
