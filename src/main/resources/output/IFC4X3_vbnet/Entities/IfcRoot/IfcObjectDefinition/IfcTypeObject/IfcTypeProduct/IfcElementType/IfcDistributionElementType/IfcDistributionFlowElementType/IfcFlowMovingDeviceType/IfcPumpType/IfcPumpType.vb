Public Class IfcPumpType Inherits IfcFlowMovingDeviceType
    Public PredefinedType As IfcPumpTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcPumpTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPumpTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
