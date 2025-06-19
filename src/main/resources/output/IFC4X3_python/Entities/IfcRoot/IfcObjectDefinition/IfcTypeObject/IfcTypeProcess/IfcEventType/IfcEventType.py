class IfcEventType(IfcTypeProcess):
    def __init__(self):
        self.PredefinedType: IfcEventTypeEnum = None
        self.EventTriggerType: IfcEventTriggerTypeEnum = None
        self.UserDefinedEventTriggerType: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
    # CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
