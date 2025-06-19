public class IfcDerivedProfileDef : IfcProfileDef
{
    public IfcProfileDef ParentProfile { get; set; }
    public IfcCartesianTransformationOperator2D Operator { get; set; }
    public IfcLabel Label { get; set; }

    // === EXTENDED BY ===
    // IfcMirroredProfileDef

    // === WHERE CLAUSES ===
    // InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType
}
