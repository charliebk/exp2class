Public Class IfcInterceptorType Inherits IfcFlowTreatmentDeviceType
    Public PredefinedType As IfcInterceptorTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcInterceptorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcInterceptorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
