Public Class IfcKerbType Inherits IfcBuiltElementType
    Public PredefinedType As IfcKerbTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
