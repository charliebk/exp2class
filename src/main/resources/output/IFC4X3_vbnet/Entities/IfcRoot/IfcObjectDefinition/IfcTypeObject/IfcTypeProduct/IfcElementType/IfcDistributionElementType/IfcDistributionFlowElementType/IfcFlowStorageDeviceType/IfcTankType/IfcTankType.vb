Public Class IfcTankType Inherits IfcFlowStorageDeviceType
    Public PredefinedType As IfcTankTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTankTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTankTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
