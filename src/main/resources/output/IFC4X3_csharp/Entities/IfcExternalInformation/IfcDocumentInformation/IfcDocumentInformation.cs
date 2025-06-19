public class IfcDocumentInformation : IfcExternalInformation
{
    public IfcIdentifier Identification { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcURIReference Location { get; set; }
    public IfcText Purpose { get; set; }
    public IfcText IntendedUse { get; set; }
    public IfcText Scope { get; set; }
    public IfcLabel Revision { get; set; }
    public IfcActorSelect DocumentOwner { get; set; }
    public SET [1:?] OF IfcActorSelect Editors { get; set; }
    public IfcDateTime CreationTime { get; set; }
    public IfcDateTime LastRevisionTime { get; set; }
    public IfcIdentifier ElectronicFormat { get; set; }
    public IfcDate ValidFrom { get; set; }
    public IfcDate ValidUntil { get; set; }
    public IfcDocumentConfidentialityEnum Confidentiality { get; set; }
    public IfcDocumentStatusEnum Status { get; set; }

    // === INVERSE CLAUSES ===
    // DocumentInfoForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument
    // HasDocumentReferences : SET [0:?] OF IfcDocumentReference FOR ReferencedDocument
    // IsPointedTo : SET [0:?] OF IfcDocumentInformationRelationship FOR RelatedDocuments
    // IsPointer : SET [0:1] OF IfcDocumentInformationRelationship FOR RelatingDocument
}
