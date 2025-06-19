Public Class IfcChimneyType Inherits IfcBuiltElementType
    Public PredefinedType As IfcChimneyTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
