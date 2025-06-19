Public Class IfcBearingType Inherits IfcBuiltElementType
    Public PredefinedType As IfcBearingTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcBearingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBearingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
