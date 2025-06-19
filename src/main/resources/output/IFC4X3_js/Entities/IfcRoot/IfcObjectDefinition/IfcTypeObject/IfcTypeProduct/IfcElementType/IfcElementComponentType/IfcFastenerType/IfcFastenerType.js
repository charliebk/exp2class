class IfcFastenerType extends IfcElementComponentType {
    constructor() {
        /** @type {IFCFASTENERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
