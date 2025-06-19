public class IfcCartesianTransformationOperator2DnonUniform extends IfcCartesianTransformationOperator2D {
    public IfcReal Scale2;

    // === WHERE CLAUSES ===
    // Scale2GreaterZero : Scl2 > 0.0

    // === DERIVE CLAUSES ===
    // Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
}
