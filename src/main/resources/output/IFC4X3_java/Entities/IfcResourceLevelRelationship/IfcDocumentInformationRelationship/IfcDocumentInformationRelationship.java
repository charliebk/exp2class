public class IfcDocumentInformationRelationship extends IfcResourceLevelRelationship {
    public IfcDocumentInformation RelatingDocument;
    public SET [1:?] OF IfcDocumentInformation RelatedDocuments;
    public IfcLabel RelationshipType;
}
