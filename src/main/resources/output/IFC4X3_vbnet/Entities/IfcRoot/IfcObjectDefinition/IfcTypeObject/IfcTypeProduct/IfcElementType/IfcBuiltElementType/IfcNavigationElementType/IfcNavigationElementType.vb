Public Class IfcNavigationElementType Inherits IfcBuiltElementType
    Public PredefinedType As IfcNavigationElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcNavigationElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcNavigationElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
