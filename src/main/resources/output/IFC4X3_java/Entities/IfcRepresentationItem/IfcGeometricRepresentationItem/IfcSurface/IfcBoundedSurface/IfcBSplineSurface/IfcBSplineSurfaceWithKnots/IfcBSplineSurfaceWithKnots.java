public class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface {
    public List<IfcInteger> UMultiplicities;
    public List<IfcInteger> VMultiplicities;
    public List<IfcParameterValue> UKnots;
    public List<IfcParameterValue> VKnots;
    public IfcKnotType KnotSpec;

    // === EXTENDED BY ===
    // IfcRationalBSplineSurfaceWithKnots

    // === WHERE CLAUSES ===
    // CorrespondingULists : SIZEOF(UMultiplicities) = KnotUUpper
    // CorrespondingVLists : SIZEOF(VMultiplicities) = KnotVUpper
    // UDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.UDegree, KnotUUpper, SELF\IfcBSplineSurface.UUpper, UMultiplicities, UKnots)
    // VDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.VDegree, KnotVUpper, SELF\IfcBSplineSurface.VUpper, VMultiplicities, VKnots)

    // === DERIVE CLAUSES ===
    // KnotVUpper : IfcInteger := SIZEOF(VKnots)
    // KnotUUpper : IfcInteger := SIZEOF(UKnots)
}
