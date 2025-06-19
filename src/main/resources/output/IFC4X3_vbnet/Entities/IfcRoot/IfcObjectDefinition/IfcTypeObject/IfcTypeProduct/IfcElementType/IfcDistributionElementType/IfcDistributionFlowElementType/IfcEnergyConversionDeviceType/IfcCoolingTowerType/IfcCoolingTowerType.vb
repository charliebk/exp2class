Public Class IfcCoolingTowerType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcCoolingTowerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCoolingTowerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoolingTowerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
