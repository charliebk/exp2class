Public Class IfcFootingType Inherits IfcBuiltElementType
    Public PredefinedType As IfcFootingTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcFootingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFootingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
