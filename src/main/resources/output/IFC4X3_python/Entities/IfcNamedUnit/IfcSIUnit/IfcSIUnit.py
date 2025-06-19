class IfcSIUnit(IfcNamedUnit):
    def __init__(self):
        self.Prefix: IfcSIPrefix = None
        self.Name: IfcSIUnitName = None

    # === DERIVE CLAUSES ===
    # SELF\IfcNamedUnit.Dimensions : IfcDimensionalExponents := IfcDimensionsForSIUnit (SELF.Name)
