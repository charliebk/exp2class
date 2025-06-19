public class IfcBSplineCurveWithKnots extends IfcBSplineCurve {
    public List<IfcInteger> KnotMultiplicities;
    public List<IfcParameterValue> Knots;
    public IfcKnotType KnotSpec;

    // === EXTENDED BY ===
    // IfcRationalBSplineCurveWithKnots

    // === WHERE CLAUSES ===
    // ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots, UpperIndexOnControlPoints, KnotMultiplicities, Knots)
    // CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots

    // === DERIVE CLAUSES ===
    // UpperIndexOnKnots : IfcInteger := SIZEOF(Knots)
}
