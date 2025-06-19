Public Class IfcHumidifierType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcHumidifierTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcHumidifierTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHumidifierTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
