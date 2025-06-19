class IfcStructuralLoadTemperature(IfcStructuralLoadStatic):
    def __init__(self):
        self.DeltaTConstant: IfcThermodynamicTemperatureMeasure = None
        self.DeltaTY: IfcThermodynamicTemperatureMeasure = None
        self.DeltaTZ: IfcThermodynamicTemperatureMeasure = None
