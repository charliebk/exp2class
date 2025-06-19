Public Class IfcProcedureType Inherits IfcTypeProcess
    Public PredefinedType As IfcProcedureTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
End Class
