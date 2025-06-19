public class IfcEdgeLoop extends IfcLoop {
    public List<IfcOrientedEdge> EdgeList;

    // === WHERE CLAUSES ===
    // IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd)
    // IsContinuous : IfcLoopHeadToTail(SELF)

    // === DERIVE CLAUSES ===
    // Ne : IfcInteger := SIZEOF(EdgeList)
}
