Public Class IfcSignalType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcSignalTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
