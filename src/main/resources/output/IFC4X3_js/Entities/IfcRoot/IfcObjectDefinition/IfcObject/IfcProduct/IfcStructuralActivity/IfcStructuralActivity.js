class IfcStructuralActivity extends IfcProduct {
    constructor() {
        /** @type {IFCSTRUCTURALLOAD} */
        this.AppliedLoad = null;
        /** @type {IFCGLOBALORLOCALENUM} */
        this.GlobalOrLocal = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralAction
    // IfcStructuralReaction

    // === INVERSE CLAUSES ===
    // AssignedToStructuralItem : SET [0:1] OF IfcRelConnectsStructuralActivity FOR RelatedStructuralActivity
}
