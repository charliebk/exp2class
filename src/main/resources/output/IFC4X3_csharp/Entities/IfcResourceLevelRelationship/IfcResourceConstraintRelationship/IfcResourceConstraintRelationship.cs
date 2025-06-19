public class IfcResourceConstraintRelationship : IfcResourceLevelRelationship
{
    public IfcConstraint RelatingConstraint { get; set; }
    public SET [1:?] OF IfcResourceObjectSelect RelatedResourceObjects { get; set; }
}
