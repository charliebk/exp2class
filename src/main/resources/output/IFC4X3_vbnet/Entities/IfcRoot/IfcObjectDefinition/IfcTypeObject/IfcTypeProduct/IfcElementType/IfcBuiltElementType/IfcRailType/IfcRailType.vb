Public Class IfcRailType Inherits IfcBuiltElementType
    Public PredefinedType As IfcRailTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
