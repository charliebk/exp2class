Public Class IfcTubeBundleType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcTubeBundleTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
