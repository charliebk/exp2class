class IfcTask extends IfcProcess {
    constructor() {
        /** @type {IFCLABEL} */
        this.Status = null;
        /** @type {IFCLABEL} */
        this.WorkMethod = null;
        /** @type {IFCBOOLEAN} */
        this.IsMilestone = null;
        /** @type {IFCINTEGER} */
        this.Priority = null;
        /** @type {IFCTASKTIME} */
        this.TaskTime = null;
        /** @type {IFCTASKTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // HasName : EXISTS(SELF\IfcRoot.Name)
}
