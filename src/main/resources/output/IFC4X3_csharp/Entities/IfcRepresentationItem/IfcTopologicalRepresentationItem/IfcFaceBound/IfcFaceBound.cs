public class IfcFaceBound : IfcTopologicalRepresentationItem
{
    public IfcLoop Bound { get; set; }
    public IfcBoolean Orientation { get; set; }

    // === EXTENDED BY ===
    // IfcFaceOuterBound
}
