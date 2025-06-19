class IfcDerivedUnit:
    def __init__(self):
        self.Elements: SET [1:?] OF IfcDerivedUnitElement = None
        self.UnitType: IfcDerivedUnitEnum = None
        self.UserDefinedType: IfcLabel = None
        self.Name: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ))
    # WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND (EXISTS(SELF.UserDefinedType)))

    # === DERIVE CLAUSES ===
    # Dimensions : IfcDimensionalExponents := IfcDeriveDimensionalExponents(Elements)
