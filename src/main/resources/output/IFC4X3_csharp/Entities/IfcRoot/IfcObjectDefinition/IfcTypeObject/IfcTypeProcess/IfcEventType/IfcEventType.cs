public class IfcEventType : IfcTypeProcess
{
    public IfcEventTypeEnum PredefinedType { get; set; }
    public IfcEventTriggerTypeEnum EventTriggerType { get; set; }
    public IfcLabel UserDefinedEventTriggerType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
    // CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
}
