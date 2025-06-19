class IfcStructuralMember extends IfcStructuralItem {
    constructor() {
        // no parameters
    }

    // === EXTENDED BY ===
    // IfcStructuralCurveMember
    // IfcStructuralSurfaceMember

    // === INVERSE CLAUSES ===
    // ConnectedBy : SET [0:?] OF IfcRelConnectsStructuralMember FOR RelatingStructuralMember
}
