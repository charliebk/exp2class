Public Class IfcFilterType Inherits IfcFlowTreatmentDeviceType
    Public PredefinedType As IfcFilterTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
