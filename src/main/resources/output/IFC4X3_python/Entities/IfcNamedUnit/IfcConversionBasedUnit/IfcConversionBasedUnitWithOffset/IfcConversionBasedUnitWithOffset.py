class IfcConversionBasedUnitWithOffset(IfcConversionBasedUnit):
    def __init__(self):
        self.ConversionOffset: IfcReal = None
