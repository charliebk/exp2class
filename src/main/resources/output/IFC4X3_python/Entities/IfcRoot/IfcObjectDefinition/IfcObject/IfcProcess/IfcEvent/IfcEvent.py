class IfcEvent(IfcProcess):
    def __init__(self):
        self.PredefinedType: IfcEventTypeEnum = None
        self.EventTriggerType: IfcEventTriggerTypeEnum = None
        self.UserDefinedEventTriggerType: IfcLabel = None
        self.EventOccurenceTime: IfcEventTime = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
