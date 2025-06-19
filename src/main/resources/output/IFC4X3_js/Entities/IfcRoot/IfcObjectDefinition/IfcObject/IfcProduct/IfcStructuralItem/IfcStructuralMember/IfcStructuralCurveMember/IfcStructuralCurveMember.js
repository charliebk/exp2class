class IfcStructuralCurveMember extends IfcStructuralMember {
    constructor() {
        /** @type {IFCSTRUCTURALCURVEMEMBERTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCDIRECTION} */
        this.Axis = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralCurveMemberVarying

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
