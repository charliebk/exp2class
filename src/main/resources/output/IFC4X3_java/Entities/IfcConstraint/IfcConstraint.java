public class IfcConstraint {
    public IfcLabel Name;
    public IfcText Description;
    public IfcConstraintEnum ConstraintGrade;
    public IfcLabel ConstraintSource;
    public IfcActorSelect CreatingActor;
    public IfcDateTime CreationTime;
    public IfcLabel UserDefinedGrade;

    // === EXTENDED BY ===
    // IfcMetric
    // IfcObjective

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // PropertiesForConstraint : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatingConstraint

    // === WHERE CLAUSES ===
    // WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade))
}
