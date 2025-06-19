class IfcPipeSegmentType extends IfcFlowSegmentType {
    constructor() {
        /** @type {IFCPIPESEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPipeSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
