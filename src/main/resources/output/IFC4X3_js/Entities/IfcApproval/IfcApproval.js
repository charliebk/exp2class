class IfcApproval {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identifier = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCDATETIME} */
        this.TimeOfApproval = null;
        /** @type {IFCLABEL} */
        this.Status = null;
        /** @type {IFCLABEL} */
        this.Level = null;
        /** @type {IFCTEXT} */
        this.Qualifier = null;
        /** @type {IFCACTORSELECT} */
        this.RequestingApproval = null;
        /** @type {IFCACTORSELECT} */
        this.GivingApproval = null;
    }

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // ApprovedObjects : SET [0:?] OF IfcRelAssociatesApproval FOR RelatingApproval
    // ApprovedResources : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatingApproval
    // IsRelatedWith : SET [0:?] OF IfcApprovalRelationship FOR RelatedApprovals
    // Relates : SET [0:?] OF IfcApprovalRelationship FOR RelatingApproval

    // === WHERE CLAUSES ===
    // HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name)
}
