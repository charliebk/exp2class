public class IfcDocumentInformation extends IfcExternalInformation {
    public IfcIdentifier Identification;
    public IfcLabel Name;
    public IfcText Description;
    public IfcURIReference Location;
    public IfcText Purpose;
    public IfcText IntendedUse;
    public IfcText Scope;
    public IfcLabel Revision;
    public IfcActorSelect DocumentOwner;
    public SET [1:?] OF IfcActorSelect Editors;
    public IfcDateTime CreationTime;
    public IfcDateTime LastRevisionTime;
    public IfcIdentifier ElectronicFormat;
    public IfcDate ValidFrom;
    public IfcDate ValidUntil;
    public IfcDocumentConfidentialityEnum Confidentiality;
    public IfcDocumentStatusEnum Status;

    // === INVERSE CLAUSES ===
    // DocumentInfoForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument
    // HasDocumentReferences : SET [0:?] OF IfcDocumentReference FOR ReferencedDocument
    // IsPointedTo : SET [0:?] OF IfcDocumentInformationRelationship FOR RelatedDocuments
    // IsPointer : SET [0:1] OF IfcDocumentInformationRelationship FOR RelatingDocument
}
