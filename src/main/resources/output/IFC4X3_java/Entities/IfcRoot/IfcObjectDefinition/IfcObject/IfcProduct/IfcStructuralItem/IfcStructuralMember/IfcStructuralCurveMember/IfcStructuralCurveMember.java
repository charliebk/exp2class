public class IfcStructuralCurveMember extends IfcStructuralMember {
    public IfcStructuralCurveMemberTypeEnum PredefinedType;
    public IfcDirection Axis;

    // === EXTENDED BY ===
    // IfcStructuralCurveMemberVarying

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
