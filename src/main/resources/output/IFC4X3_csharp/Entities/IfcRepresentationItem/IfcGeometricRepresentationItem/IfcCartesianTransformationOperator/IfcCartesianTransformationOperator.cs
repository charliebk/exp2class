public class IfcCartesianTransformationOperator : IfcGeometricRepresentationItem
{
    public IfcDirection Axis1 { get; set; }
    public IfcDirection Axis2 { get; set; }
    public IfcCartesianPoint LocalOrigin { get; set; }
    public IfcReal Scale { get; set; }

    // === EXTENDED BY ===
    // IfcCartesianTransformationOperator2D
    // IfcCartesianTransformationOperator3D

    // === WHERE CLAUSES ===
    // ScaleGreaterZero : Scl > 0.0

    // === DERIVE CLAUSES ===
    // Scl : IfcReal := NVL(Scale, 1.0)
    // Dim : IfcDimensionCount := LocalOrigin.Dim
}
