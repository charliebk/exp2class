public class IfcStructuralCurveMember : IfcStructuralMember
{
    public IfcStructuralCurveMemberTypeEnum PredefinedType { get; set; }
    public IfcDirection Axis { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralCurveMemberVarying

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
