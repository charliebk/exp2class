Public Class IfcEvent Inherits IfcProcess
    Public PredefinedType As IfcEventTypeEnum
    Public EventTriggerType As IfcEventTriggerTypeEnum
    Public UserDefinedEventTriggerType As IfcLabel
    Public EventOccurenceTime As IfcEventTime

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType))
End Class
