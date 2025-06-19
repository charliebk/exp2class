public class IfcBSplineCurveWithKnots : IfcBSplineCurve
{
    public List<IfcInteger> KnotMultiplicities { get; set; }
    public List<IfcParameterValue> Knots { get; set; }
    public IfcKnotType KnotSpec { get; set; }

    // === EXTENDED BY ===
    // IfcRationalBSplineCurveWithKnots

    // === WHERE CLAUSES ===
    // ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots, UpperIndexOnControlPoints, KnotMultiplicities, Knots)
    // CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots

    // === DERIVE CLAUSES ===
    // UpperIndexOnKnots : IfcInteger := SIZEOF(Knots)
}
