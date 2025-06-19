Public Class IfcCondenserType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcCondenserTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
