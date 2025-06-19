Public Class IfcCoveringType Inherits IfcBuiltElementType
    Public PredefinedType As IfcCoveringTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCoveringTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoveringTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
