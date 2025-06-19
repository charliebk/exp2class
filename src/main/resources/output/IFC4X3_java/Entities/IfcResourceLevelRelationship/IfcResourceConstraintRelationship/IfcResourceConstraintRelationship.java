public class IfcResourceConstraintRelationship extends IfcResourceLevelRelationship {
    public IfcConstraint RelatingConstraint;
    public SET [1:?] OF IfcResourceObjectSelect RelatedResourceObjects;
}
