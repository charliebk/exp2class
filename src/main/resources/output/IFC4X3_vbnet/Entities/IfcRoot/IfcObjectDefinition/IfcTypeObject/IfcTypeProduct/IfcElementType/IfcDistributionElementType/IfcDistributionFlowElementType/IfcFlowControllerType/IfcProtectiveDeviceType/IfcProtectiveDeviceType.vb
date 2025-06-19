Public Class IfcProtectiveDeviceType Inherits IfcFlowControllerType
    Public PredefinedType As IfcProtectiveDeviceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
