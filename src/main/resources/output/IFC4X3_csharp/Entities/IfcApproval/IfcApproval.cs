public class IfcApproval
{
    public IfcIdentifier Identifier { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcDateTime TimeOfApproval { get; set; }
    public IfcLabel Status { get; set; }
    public IfcLabel Level { get; set; }
    public IfcText Qualifier { get; set; }
    public IfcActorSelect RequestingApproval { get; set; }
    public IfcActorSelect GivingApproval { get; set; }

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // ApprovedObjects : SET [0:?] OF IfcRelAssociatesApproval FOR RelatingApproval
    // ApprovedResources : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatingApproval
    // IsRelatedWith : SET [0:?] OF IfcApprovalRelationship FOR RelatedApprovals
    // Relates : SET [0:?] OF IfcApprovalRelationship FOR RelatingApproval

    // === WHERE CLAUSES ===
    // HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name)
}
