public class IfcDerivedProfileDef extends IfcProfileDef {
    public IfcProfileDef ParentProfile;
    public IfcCartesianTransformationOperator2D Operator;
    public IfcLabel Label;

    // === EXTENDED BY ===
    // IfcMirroredProfileDef

    // === WHERE CLAUSES ===
    // InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType
}
