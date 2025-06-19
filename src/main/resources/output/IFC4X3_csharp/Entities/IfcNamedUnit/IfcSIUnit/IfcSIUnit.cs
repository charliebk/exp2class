public class IfcSIUnit : IfcNamedUnit
{
    public IfcSIPrefix Prefix { get; set; }
    public IfcSIUnitName Name { get; set; }

    // === DERIVE CLAUSES ===
    // SELF\IfcNamedUnit.Dimensions : IfcDimensionalExponents := IfcDimensionsForSIUnit (SELF.Name)
}
