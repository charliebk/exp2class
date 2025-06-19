Public Class IfcPlateType Inherits IfcBuiltElementType
    Public PredefinedType As IfcPlateTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
