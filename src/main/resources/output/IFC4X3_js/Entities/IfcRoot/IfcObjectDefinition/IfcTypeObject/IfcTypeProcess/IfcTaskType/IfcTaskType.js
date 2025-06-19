class IfcTaskType extends IfcTypeProcess {
    constructor() {
        /** @type {IFCTASKTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCLABEL} */
        this.WorkMethod = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
}
