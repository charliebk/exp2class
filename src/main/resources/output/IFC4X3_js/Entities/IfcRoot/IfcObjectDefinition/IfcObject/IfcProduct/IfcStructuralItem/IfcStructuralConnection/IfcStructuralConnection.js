class IfcStructuralConnection extends IfcStructuralItem {
    constructor() {
        /** @type {IFCBOUNDARYCONDITION} */
        this.AppliedCondition = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralCurveConnection
    // IfcStructuralPointConnection
    // IfcStructuralSurfaceConnection

    // === INVERSE CLAUSES ===
    // ConnectsStructuralMembers : SET [1:?] OF IfcRelConnectsStructuralMember FOR RelatedStructuralConnection
}
