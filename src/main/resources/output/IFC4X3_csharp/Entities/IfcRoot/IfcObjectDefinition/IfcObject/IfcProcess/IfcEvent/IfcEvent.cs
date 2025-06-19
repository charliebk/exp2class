public class IfcEvent : IfcProcess
{
    public IfcEventTypeEnum PredefinedType { get; set; }
    public IfcEventTriggerTypeEnum EventTriggerType { get; set; }
    public IfcLabel UserDefinedEventTriggerType { get; set; }
    public IfcEventTime EventOccurenceTime { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
}
