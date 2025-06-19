public class IfcEdgeLoop : IfcLoop
{
    public List<IfcOrientedEdge> EdgeList { get; set; }

    // === WHERE CLAUSES ===
    // IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd)
    // IsContinuous : IfcLoopHeadToTail(SELF)

    // === DERIVE CLAUSES ===
    // Ne : IfcInteger := SIZEOF(EdgeList)
}
