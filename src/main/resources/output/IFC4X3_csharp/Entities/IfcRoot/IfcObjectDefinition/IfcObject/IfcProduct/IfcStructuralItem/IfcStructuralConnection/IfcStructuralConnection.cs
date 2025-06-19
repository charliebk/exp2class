public class IfcStructuralConnection : IfcStructuralItem
{
    public IfcBoundaryCondition AppliedCondition { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralCurveConnection
    // IfcStructuralPointConnection
    // IfcStructuralSurfaceConnection

    // === INVERSE CLAUSES ===
    // ConnectsStructuralMembers : SET [1:?] OF IfcRelConnectsStructuralMember FOR RelatedStructuralConnection
}
