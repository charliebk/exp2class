Public Class IfcPavementType Inherits IfcBuiltElementType
    Public PredefinedType As IfcPavementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
