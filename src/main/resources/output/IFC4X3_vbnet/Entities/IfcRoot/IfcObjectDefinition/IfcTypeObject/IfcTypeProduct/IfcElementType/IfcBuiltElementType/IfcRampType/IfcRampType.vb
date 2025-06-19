Public Class IfcRampType Inherits IfcBuiltElementType
    Public PredefinedType As IfcRampTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
