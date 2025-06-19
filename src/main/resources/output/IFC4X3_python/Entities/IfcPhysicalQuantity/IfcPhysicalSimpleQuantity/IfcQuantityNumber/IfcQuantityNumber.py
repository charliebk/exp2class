class IfcQuantityNumber(IfcPhysicalSimpleQuantity):
    def __init__(self):
        self.NumberValue: IfcNumericMeasure = None
        self.Formula: IfcLabel = None
