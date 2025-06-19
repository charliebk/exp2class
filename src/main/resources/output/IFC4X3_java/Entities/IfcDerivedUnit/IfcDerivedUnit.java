public class IfcDerivedUnit {
    public SET [1:?] OF IfcDerivedUnitElement Elements;
    public IfcDerivedUnitEnum UnitType;
    public IfcLabel UserDefinedType;
    public IfcLabel Name;

    // === WHERE CLAUSES ===
    // WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ))
    // WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND (EXISTS(SELF.UserDefinedType)))

    // === DERIVE CLAUSES ===
    // Dimensions : IfcDimensionalExponents := IfcDeriveDimensionalExponents(Elements)
}
