public class IfcConstraint
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcConstraintEnum ConstraintGrade { get; set; }
    public IfcLabel ConstraintSource { get; set; }
    public IfcActorSelect CreatingActor { get; set; }
    public IfcDateTime CreationTime { get; set; }
    public IfcLabel UserDefinedGrade { get; set; }

    // === EXTENDED BY ===
    // IfcMetric
    // IfcObjective

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // PropertiesForConstraint : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatingConstraint

    // === WHERE CLAUSES ===
    // WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade))
}
