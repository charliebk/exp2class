Public Class IfcTaskType Inherits IfcTypeProcess
    Public PredefinedType As IfcTaskTypeEnum
    Public WorkMethod As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
End Class
