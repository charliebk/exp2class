public class IfcBoundingBox : IfcGeometricRepresentationItem
{
    public IfcCartesianPoint Corner { get; set; }
    public IfcPositiveLengthMeasure XDim { get; set; }
    public IfcPositiveLengthMeasure YDim { get; set; }
    public IfcPositiveLengthMeasure ZDim { get; set; }

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
