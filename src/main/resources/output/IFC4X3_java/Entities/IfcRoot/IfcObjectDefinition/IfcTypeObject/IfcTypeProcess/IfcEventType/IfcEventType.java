public class IfcEventType extends IfcTypeProcess {
    public IfcEventTypeEnum PredefinedType;
    public IfcEventTriggerTypeEnum EventTriggerType;
    public IfcLabel UserDefinedEventTriggerType;

    // === WHERE CLAUSES ===
    // CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
    // CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
}
