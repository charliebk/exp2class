class IfcFailureConnectionCondition(IfcStructuralConnectionCondition):
    def __init__(self):
        self.TensionFailureX: IfcForceMeasure = None
        self.TensionFailureY: IfcForceMeasure = None
        self.TensionFailureZ: IfcForceMeasure = None
        self.CompressionFailureX: IfcForceMeasure = None
        self.CompressionFailureY: IfcForceMeasure = None
        self.CompressionFailureZ: IfcForceMeasure = None
