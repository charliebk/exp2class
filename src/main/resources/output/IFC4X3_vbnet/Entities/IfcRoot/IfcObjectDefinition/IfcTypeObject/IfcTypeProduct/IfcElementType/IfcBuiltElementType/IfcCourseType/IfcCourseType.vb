Public Class IfcCourseType Inherits IfcBuiltElementType
    Public PredefinedType As IfcCourseTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCourseTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCourseTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
