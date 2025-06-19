public class IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D {
    public IfcReal Scale2;
    public IfcReal Scale3;

    // === WHERE CLAUSES ===
    // Scale2GreaterZero : Scl2 > 0.0
    // Scale3GreaterZero : Scl3 > 0.0

    // === DERIVE CLAUSES ===
    // Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
    // Scl3 : IfcReal := NVL(Scale3, SELF\IfcCartesianTransformationOperator.Scl)
}
