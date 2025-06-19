Public Class IfcCaissonFoundationType Inherits IfcDeepFoundationType
    Public PredefinedType As IfcCaissonFoundationTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
