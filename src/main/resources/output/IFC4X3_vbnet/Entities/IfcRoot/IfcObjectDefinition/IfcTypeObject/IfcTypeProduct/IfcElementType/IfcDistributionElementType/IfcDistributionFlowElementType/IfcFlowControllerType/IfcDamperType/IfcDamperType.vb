Public Class IfcDamperType Inherits IfcFlowControllerType
    Public PredefinedType As IfcDamperTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcDamperTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
