Public Class IfcMedicalDeviceType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcMedicalDeviceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcMedicalDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMedicalDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
