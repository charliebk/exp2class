public class IfcDocumentInformationRelationship : IfcResourceLevelRelationship
{
    public IfcDocumentInformation RelatingDocument { get; set; }
    public SET [1:?] OF IfcDocumentInformation RelatedDocuments { get; set; }
    public IfcLabel RelationshipType { get; set; }
}
