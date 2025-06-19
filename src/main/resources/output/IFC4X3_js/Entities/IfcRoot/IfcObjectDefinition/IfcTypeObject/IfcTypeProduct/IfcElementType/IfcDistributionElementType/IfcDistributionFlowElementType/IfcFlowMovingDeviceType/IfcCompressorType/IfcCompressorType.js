class IfcCompressorType extends IfcFlowMovingDeviceType {
    constructor() {
        /** @type {IFCCOMPRESSORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
