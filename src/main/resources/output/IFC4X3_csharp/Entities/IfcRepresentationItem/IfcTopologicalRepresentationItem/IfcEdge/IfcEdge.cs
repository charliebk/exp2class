public class IfcEdge : IfcTopologicalRepresentationItem
{
    public IfcVertex EdgeStart { get; set; }
    public IfcVertex EdgeEnd { get; set; }

    // === EXTENDED BY ===
    // IfcEdgeCurve
    // IfcOrientedEdge
    // IfcSubedge
}
