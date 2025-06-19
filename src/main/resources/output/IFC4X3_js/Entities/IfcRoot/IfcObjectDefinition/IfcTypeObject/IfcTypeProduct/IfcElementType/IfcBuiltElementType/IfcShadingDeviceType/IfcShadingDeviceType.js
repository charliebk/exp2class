class IfcShadingDeviceType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCSHADINGDEVICETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcShadingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcShadingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
