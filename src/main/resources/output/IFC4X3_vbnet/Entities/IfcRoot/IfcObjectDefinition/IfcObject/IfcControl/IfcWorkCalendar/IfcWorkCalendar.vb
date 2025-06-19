Public Class IfcWorkCalendar Inherits IfcControl
    Public WorkingTimes As SET [1:?] OF IfcWorkTime
    Public ExceptionTimes As SET [1:?] OF IfcWorkTime
    Public PredefinedType As IfcWorkCalendarTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
End Class
