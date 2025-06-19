Public Class IfcSolarDeviceType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcSolarDeviceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSolarDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSolarDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
