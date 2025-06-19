Public Class IfcBurnerType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcBurnerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
