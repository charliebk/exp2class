public class IfcExternalReferenceRelationship extends IfcResourceLevelRelationship {
    public IfcExternalReference RelatingReference;
    public SET [1:?] OF IfcResourceObjectSelect RelatedResourceObjects;
}
