Public Class IfcStackTerminalType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcStackTerminalTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcStackTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStackTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
