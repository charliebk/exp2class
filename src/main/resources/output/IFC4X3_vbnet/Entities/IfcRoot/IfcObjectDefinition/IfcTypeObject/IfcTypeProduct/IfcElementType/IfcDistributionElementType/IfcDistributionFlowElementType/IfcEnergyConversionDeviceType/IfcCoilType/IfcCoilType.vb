Public Class IfcCoilType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcCoilTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
