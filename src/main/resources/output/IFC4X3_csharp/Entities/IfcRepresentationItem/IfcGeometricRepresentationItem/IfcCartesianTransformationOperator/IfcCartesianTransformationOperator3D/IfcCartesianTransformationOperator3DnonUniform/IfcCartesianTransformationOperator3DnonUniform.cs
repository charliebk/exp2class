public class IfcCartesianTransformationOperator3DnonUniform : IfcCartesianTransformationOperator3D
{
    public IfcReal Scale2 { get; set; }
    public IfcReal Scale3 { get; set; }

    // === WHERE CLAUSES ===
    // Scale2GreaterZero : Scl2 > 0.0
    // Scale3GreaterZero : Scl3 > 0.0

    // === DERIVE CLAUSES ===
    // Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
    // Scl3 : IfcReal := NVL(Scale3, SELF\IfcCartesianTransformationOperator.Scl)
}
