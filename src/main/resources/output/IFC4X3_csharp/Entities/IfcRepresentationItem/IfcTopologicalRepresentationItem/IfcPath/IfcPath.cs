public class IfcPath : IfcTopologicalRepresentationItem
{
    public List<UNIQUE IfcOrientedEdge> EdgeList { get; set; }

    // === WHERE CLAUSES ===
    // IsContinuous : IfcPathHeadToTail(SELF)
}
