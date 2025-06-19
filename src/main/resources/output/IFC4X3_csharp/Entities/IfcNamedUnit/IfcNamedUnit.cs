public class IfcNamedUnit
{
    public IfcDimensionalExponents Dimensions { get; set; }
    public IfcUnitEnum UnitType { get; set; }

    // === EXTENDED BY ===
    // IfcContextDependentUnit
    // IfcConversionBasedUnit
    // IfcSIUnit

    // === WHERE CLAUSES ===
    // WR1 : IfcCorrectDimensions (SELF.UnitType, SELF.Dimensions)
}
