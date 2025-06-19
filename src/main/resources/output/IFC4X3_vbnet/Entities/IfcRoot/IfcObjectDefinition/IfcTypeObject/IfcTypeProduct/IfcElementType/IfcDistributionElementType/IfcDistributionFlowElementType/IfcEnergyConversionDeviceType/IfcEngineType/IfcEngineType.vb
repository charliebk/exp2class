Public Class IfcEngineType Inherits IfcEnergyConversionDeviceType
    Public PredefinedType As IfcEngineTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
