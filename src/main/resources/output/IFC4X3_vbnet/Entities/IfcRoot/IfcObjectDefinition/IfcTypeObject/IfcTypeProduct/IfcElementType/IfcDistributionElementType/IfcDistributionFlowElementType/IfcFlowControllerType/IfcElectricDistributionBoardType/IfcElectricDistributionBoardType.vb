Public Class IfcElectricDistributionBoardType Inherits IfcFlowControllerType
    Public PredefinedType As IfcElectricDistributionBoardTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcElectricDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
