public class IfcBSplineSurfaceWithKnots : IfcBSplineSurface
{
    public List<IfcInteger> UMultiplicities { get; set; }
    public List<IfcInteger> VMultiplicities { get; set; }
    public List<IfcParameterValue> UKnots { get; set; }
    public List<IfcParameterValue> VKnots { get; set; }
    public IfcKnotType KnotSpec { get; set; }

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
