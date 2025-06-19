class IfcPropertySingleValue(IfcSimpleProperty):
    def __init__(self):
        self.NominalValue: IfcValue = None
        self.Unit: IfcUnit = None
