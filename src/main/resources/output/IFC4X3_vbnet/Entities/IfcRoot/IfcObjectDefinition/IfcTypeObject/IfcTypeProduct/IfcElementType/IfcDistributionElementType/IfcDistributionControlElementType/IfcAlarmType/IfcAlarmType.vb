Public Class IfcAlarmType Inherits IfcDistributionControlElementType
    Public PredefinedType As IfcAlarmTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcAlarmTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAlarmTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
