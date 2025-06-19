public class IfcApproval {
    public IfcIdentifier Identifier;
    public IfcLabel Name;
    public IfcText Description;
    public IfcDateTime TimeOfApproval;
    public IfcLabel Status;
    public IfcLabel Level;
    public IfcText Qualifier;
    public IfcActorSelect RequestingApproval;
    public IfcActorSelect GivingApproval;

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // ApprovedObjects : SET [0:?] OF IfcRelAssociatesApproval FOR RelatingApproval
    // ApprovedResources : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatingApproval
    // IsRelatedWith : SET [0:?] OF IfcApprovalRelationship FOR RelatedApprovals
    // Relates : SET [0:?] OF IfcApprovalRelationship FOR RelatingApproval

    // === WHERE CLAUSES ===
    // HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name)
}
