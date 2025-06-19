public class IfcVector extends IfcGeometricRepresentationItem {
    public IfcDirection Orientation;
    public IfcLengthMeasure Magnitude;

    // === WHERE CLAUSES ===
    // MagGreaterOrEqualZero : Magnitude >= 0.0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := Orientation.Dim
}
