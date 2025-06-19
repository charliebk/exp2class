class IfcStairFlightType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCSTAIRFLIGHTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
