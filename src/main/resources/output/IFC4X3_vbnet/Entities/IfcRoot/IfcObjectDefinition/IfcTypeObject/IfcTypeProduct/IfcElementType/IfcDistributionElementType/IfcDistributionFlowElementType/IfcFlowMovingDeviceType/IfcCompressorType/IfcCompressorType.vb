Public Class IfcCompressorType Inherits IfcFlowMovingDeviceType
    Public PredefinedType As IfcCompressorTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
