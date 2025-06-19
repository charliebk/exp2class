class IfcStructuralSurfaceMember extends IfcStructuralMember {
    constructor() {
        /** @type {IFCSTRUCTURALSURFACEMEMBERTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Thickness = null;
    }

    // === EXTENDED BY ===
    // IfcStructuralSurfaceMemberVarying

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
