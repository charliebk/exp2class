public class IfcOrientedEdge : IfcEdge
{
    public IfcEdge EdgeElement { get; set; }
    public IfcBoolean Orientation { get; set; }

    // === WHERE CLAUSES ===
    // EdgeElementNotOriented : NOT('IFC4X3_DEV_73740fe4.IFCORIENTEDEDGE' IN TYPEOF(EdgeElement))

    // === DERIVE CLAUSES ===
    // SELF\IfcEdge.EdgeStart : IfcVertex := IfcBooleanChoose (Orientation, EdgeElement.EdgeStart, EdgeElement.EdgeEnd)
    // SELF\IfcEdge.EdgeEnd : IfcVertex := IfcBooleanChoose (Orientation, EdgeElement.EdgeEnd, EdgeElement.EdgeStart)
}
