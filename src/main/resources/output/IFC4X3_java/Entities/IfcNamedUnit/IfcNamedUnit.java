public class IfcNamedUnit {
    public IfcDimensionalExponents Dimensions;
    public IfcUnitEnum UnitType;

    // === EXTENDED BY ===
    // IfcContextDependentUnit
    // IfcConversionBasedUnit
    // IfcSIUnit

    // === WHERE CLAUSES ===
    // WR1 : IfcCorrectDimensions (SELF.UnitType, SELF.Dimensions)
}
