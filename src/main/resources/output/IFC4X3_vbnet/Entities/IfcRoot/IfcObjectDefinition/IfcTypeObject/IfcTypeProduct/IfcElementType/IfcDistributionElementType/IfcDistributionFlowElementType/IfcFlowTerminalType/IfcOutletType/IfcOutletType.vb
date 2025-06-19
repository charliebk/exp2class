Public Class IfcOutletType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcOutletTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcOutletTypeEnum.USERDEFINED) OR ((PredefinedType = IfcOutletTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
