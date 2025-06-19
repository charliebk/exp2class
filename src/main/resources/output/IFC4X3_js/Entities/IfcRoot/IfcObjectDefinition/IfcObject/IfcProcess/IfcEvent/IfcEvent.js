class IfcEvent extends IfcProcess {
    constructor() {
        /** @type {IFCEVENTTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCEVENTTRIGGERTYPEENUM} */
        this.EventTriggerType = null;
        /** @type {IFCLABEL} */
        this.UserDefinedEventTriggerType = null;
        /** @type {IFCEVENTTIME} */
        this.EventOccurenceTime = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
}
