public class IfcReparametrisedCompositeCurveSegment : IfcCompositeCurveSegment
{
    public IfcParameterValue ParamLength { get; set; }

    // === WHERE CLAUSES ===
    // PositiveLengthParameter : ParamLength > 0.0
}
