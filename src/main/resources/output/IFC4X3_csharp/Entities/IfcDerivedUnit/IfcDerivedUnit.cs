public class IfcDerivedUnit
{
    public SET [1:?] OF IfcDerivedUnitElement Elements { get; set; }
    public IfcDerivedUnitEnum UnitType { get; set; }
    public IfcLabel UserDefinedType { get; set; }
    public IfcLabel Name { get; set; }

    // === WHERE CLAUSES ===
    // WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ))
    // WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND (EXISTS(SELF.UserDefinedType)))

    // === DERIVE CLAUSES ===
    // Dimensions : IfcDimensionalExponents := IfcDeriveDimensionalExponents(Elements)
}
