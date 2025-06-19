Public Class IfcProtectiveDeviceTrippingUnitType Inherits IfcDistributionControlElementType
    Public PredefinedType As IfcProtectiveDeviceTrippingUnitTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
