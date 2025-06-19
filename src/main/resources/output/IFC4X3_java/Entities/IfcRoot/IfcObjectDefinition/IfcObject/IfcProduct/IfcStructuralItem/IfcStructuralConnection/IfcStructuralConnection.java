public class IfcStructuralConnection extends IfcStructuralItem {
    public IfcBoundaryCondition AppliedCondition;

    // === EXTENDED BY ===
    // IfcStructuralCurveConnection
    // IfcStructuralPointConnection
    // IfcStructuralSurfaceConnection

    // === INVERSE CLAUSES ===
    // ConnectsStructuralMembers : SET [1:?] OF IfcRelConnectsStructuralMember FOR RelatedStructuralConnection
}
