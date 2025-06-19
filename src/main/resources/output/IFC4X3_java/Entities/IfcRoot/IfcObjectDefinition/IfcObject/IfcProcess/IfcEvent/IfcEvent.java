public class IfcEvent extends IfcProcess {
    public IfcEventTypeEnum PredefinedType;
    public IfcEventTriggerTypeEnum EventTriggerType;
    public IfcLabel UserDefinedEventTriggerType;
    public IfcEventTime EventOccurenceTime;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
}
