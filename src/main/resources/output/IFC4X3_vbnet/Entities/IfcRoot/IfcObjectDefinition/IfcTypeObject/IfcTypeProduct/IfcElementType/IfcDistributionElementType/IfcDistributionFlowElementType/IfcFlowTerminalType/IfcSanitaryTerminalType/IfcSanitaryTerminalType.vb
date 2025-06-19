Public Class IfcSanitaryTerminalType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcSanitaryTerminalTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
