Public Class IfcControllerType Inherits IfcDistributionControlElementType
    Public PredefinedType As IfcControllerTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
