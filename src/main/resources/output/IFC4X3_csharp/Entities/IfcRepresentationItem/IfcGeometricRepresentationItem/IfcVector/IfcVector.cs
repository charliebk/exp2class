public class IfcVector : IfcGeometricRepresentationItem
{
    public IfcDirection Orientation { get; set; }
    public IfcLengthMeasure Magnitude { get; set; }

    // === WHERE CLAUSES ===
    // MagGreaterOrEqualZero : Magnitude >= 0.0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := Orientation.Dim
}
