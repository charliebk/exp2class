class IfcNamedUnit:
    def __init__(self):
        self.Dimensions: IfcDimensionalExponents = None
        self.UnitType: IfcUnitEnum = None

    # === EXTENDED BY ===
    # IfcContextDependentUnit
    # IfcConversionBasedUnit
    # IfcSIUnit

    # === WHERE CLAUSES ===
    # WR1 : IfcCorrectDimensions (SELF.UnitType, SELF.Dimensions)
