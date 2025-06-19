public class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
    public IfcDirection Axis1;
    public IfcDirection Axis2;
    public IfcCartesianPoint LocalOrigin;
    public IfcReal Scale;

    // === EXTENDED BY ===
    // IfcCartesianTransformationOperator2D
    // IfcCartesianTransformationOperator3D

    // === WHERE CLAUSES ===
    // ScaleGreaterZero : Scl > 0.0

    // === DERIVE CLAUSES ===
    // Scl : IfcReal := NVL(Scale, 1.0)
    // Dim : IfcDimensionCount := LocalOrigin.Dim
}
