Public Class IfcLiquidTerminalType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcLiquidTerminalTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcLiquidTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLiquidTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
