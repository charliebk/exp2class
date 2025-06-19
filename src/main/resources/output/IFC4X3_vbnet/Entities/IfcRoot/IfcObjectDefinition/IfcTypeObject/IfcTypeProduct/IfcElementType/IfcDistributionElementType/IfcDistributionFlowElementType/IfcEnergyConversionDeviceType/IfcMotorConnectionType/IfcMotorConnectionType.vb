Public Class IfcMotorConnectionType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcMotorConnectionTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
