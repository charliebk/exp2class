Public Class IfcAirToAirHeatRecoveryType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcAirToAirHeatRecoveryTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
