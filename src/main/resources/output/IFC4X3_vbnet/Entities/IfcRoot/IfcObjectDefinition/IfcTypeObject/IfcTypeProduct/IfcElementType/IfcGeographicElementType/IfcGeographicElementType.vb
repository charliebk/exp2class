Public Class IfcGeographicElementType Inherits IfcElementType
    Public PredefinedType As IfcGeographicElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcGeographicElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeographicElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
