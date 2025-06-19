Public Class IfcElectricTimeControlType Inherits IfcFlowControllerType
    Public PredefinedType As IfcElectricTimeControlTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcElectricTimeControlTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricTimeControlTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
