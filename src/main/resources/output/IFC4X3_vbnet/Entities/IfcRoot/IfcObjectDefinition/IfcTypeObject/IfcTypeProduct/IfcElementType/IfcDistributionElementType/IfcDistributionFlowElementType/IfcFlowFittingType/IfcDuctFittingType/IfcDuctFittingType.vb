Public Class IfcDuctFittingType Inherits IfcFlowFittingType
    Public PredefinedType As IfcDuctFittingTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcDuctFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
