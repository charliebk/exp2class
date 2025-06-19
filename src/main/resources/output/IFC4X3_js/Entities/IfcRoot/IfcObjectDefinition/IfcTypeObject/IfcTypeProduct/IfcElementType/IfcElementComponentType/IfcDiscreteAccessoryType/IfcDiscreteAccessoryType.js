class IfcDiscreteAccessoryType extends IfcElementComponentType {
    constructor() {
        /** @type {IFCDISCRETEACCESSORYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
