Public Class IfcElectricMotorType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcElectricMotorTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcElectricMotorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricMotorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
