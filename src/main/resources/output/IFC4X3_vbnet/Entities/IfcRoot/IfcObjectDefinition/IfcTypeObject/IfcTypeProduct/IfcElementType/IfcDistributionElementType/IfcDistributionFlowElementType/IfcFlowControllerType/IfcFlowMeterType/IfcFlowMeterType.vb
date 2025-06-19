Public Class IfcFlowMeterType Inherits IfcFlowControllerType
    Public PredefinedType As IfcFlowMeterTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcFlowMeterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowMeterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
