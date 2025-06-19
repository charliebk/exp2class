class IfcRampFlightType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCRAMPFLIGHTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcRampFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
