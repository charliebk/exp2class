Public Class IfcBoilerType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcBoilerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
