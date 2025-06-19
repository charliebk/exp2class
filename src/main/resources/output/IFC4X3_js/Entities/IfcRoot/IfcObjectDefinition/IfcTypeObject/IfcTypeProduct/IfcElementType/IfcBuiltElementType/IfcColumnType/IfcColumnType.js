class IfcColumnType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCCOLUMNTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcColumnTypeEnum.USERDEFINED) OR ((PredefinedType = IfcColumnTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
