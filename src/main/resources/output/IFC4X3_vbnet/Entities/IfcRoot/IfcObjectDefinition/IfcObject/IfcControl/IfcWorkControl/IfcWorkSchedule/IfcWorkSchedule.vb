Public Class IfcWorkSchedule Inherits IfcWorkControl
    Public PredefinedType As IfcWorkScheduleTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkScheduleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkScheduleTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
End Class
