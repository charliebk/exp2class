public class IfcExternalReferenceRelationship : IfcResourceLevelRelationship
{
    public IfcExternalReference RelatingReference { get; set; }
    public SET [1:?] OF IfcResourceObjectSelect RelatedResourceObjects { get; set; }
}
