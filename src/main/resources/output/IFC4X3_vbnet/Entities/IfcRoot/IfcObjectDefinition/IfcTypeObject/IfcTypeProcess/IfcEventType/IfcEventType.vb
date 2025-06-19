Public Class IfcEventType Inherits IfcTypeProcess
    Public PredefinedType As IfcEventTypeEnum
    Public EventTriggerType As IfcEventTriggerTypeEnum
    Public UserDefinedEventTriggerType As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
    ' CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
End Class
