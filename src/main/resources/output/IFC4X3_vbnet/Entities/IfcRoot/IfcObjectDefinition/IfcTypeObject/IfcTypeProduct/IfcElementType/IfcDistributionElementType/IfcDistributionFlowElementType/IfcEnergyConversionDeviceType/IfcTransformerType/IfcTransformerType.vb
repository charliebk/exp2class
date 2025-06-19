Public Class IfcTransformerType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcTransformerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTransformerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTransformerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
