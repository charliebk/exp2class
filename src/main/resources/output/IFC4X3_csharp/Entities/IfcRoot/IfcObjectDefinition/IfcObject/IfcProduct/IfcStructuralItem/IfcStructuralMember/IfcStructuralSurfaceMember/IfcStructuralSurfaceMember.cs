public class IfcStructuralSurfaceMember : IfcStructuralMember
{
    public IfcStructuralSurfaceMemberTypeEnum PredefinedType { get; set; }
    public IfcPositiveLengthMeasure Thickness { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralSurfaceMemberVarying

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
