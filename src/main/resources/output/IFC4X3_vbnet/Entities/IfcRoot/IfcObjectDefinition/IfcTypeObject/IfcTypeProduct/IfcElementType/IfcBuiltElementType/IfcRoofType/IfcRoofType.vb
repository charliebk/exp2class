Public Class IfcRoofType Inherits IfcBuiltElementType
    Public PredefinedType As IfcRoofTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcRoofTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoofTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
