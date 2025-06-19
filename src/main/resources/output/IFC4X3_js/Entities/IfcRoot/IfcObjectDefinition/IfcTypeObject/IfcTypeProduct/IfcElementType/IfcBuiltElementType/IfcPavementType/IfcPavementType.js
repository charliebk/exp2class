class IfcPavementType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCPAVEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
