public class IfcStructuralSurfaceMember extends IfcStructuralMember {
    public IfcStructuralSurfaceMemberTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure Thickness;

    // === EXTENDED BY ===
    // IfcStructuralSurfaceMemberVarying

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
