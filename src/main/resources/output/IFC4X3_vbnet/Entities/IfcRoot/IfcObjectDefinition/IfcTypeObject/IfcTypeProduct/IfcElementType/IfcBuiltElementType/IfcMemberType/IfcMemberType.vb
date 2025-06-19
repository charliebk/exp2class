Public Class IfcMemberType Inherits IfcBuiltElementType
    Public PredefinedType As IfcMemberTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcMemberTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMemberTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
