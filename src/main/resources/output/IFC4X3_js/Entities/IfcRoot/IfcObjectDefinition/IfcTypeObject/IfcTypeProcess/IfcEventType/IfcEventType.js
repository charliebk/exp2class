class IfcEventType extends IfcTypeProcess {
    constructor() {
        /** @type {IFCEVENTTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCEVENTTRIGGERTYPEENUM} */
        this.EventTriggerType = null;
        /** @type {IFCLABEL} */
        this.UserDefinedEventTriggerType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
    // CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
}
