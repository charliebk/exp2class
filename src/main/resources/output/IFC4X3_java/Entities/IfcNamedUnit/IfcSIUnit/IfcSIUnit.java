public class IfcSIUnit extends IfcNamedUnit {
    public IfcSIPrefix Prefix;
    public IfcSIUnitName Name;

    // === DERIVE CLAUSES ===
    // SELF\IfcNamedUnit.Dimensions : IfcDimensionalExponents := IfcDimensionsForSIUnit (SELF.Name)
}
