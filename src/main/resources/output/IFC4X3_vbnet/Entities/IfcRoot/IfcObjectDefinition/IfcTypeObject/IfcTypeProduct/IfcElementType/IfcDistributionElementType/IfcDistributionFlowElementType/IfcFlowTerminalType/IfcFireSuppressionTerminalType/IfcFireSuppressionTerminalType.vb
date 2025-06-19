Public Class IfcFireSuppressionTerminalType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcFireSuppressionTerminalTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcFireSuppressionTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFireSuppressionTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
