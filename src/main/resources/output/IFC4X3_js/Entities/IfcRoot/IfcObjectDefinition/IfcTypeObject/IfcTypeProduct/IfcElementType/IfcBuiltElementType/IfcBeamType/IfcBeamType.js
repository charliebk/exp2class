class IfcBeamType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCBEAMTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
