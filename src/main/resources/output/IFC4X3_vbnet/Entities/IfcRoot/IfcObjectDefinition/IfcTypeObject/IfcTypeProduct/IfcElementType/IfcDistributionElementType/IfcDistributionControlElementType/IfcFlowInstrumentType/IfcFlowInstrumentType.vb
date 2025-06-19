Public Class IfcFlowInstrumentType Inherits IfcDistributionControlElementType
    Public PredefinedType As IfcFlowInstrumentTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
