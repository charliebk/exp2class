Public Class IfcElectricFlowTreatmentDeviceType Inherits IfcFlowTreatmentDeviceType
    Public PredefinedType As IfcElectricFlowTreatmentDeviceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
