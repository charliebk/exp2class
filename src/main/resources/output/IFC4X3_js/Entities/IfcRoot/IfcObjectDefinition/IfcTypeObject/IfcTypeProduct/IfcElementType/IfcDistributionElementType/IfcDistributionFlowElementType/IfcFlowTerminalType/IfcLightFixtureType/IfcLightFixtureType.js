class IfcLightFixtureType extends IfcFlowTerminalType {
    constructor() {
        /** @type {IFCLIGHTFIXTURETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLightFixtureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLightFixtureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
