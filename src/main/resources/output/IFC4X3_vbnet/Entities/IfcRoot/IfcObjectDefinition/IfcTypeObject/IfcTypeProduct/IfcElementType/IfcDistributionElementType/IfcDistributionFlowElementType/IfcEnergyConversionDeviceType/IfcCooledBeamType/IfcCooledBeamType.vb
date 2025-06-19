Public Class IfcCooledBeamType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcCooledBeamTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
