Public Class IfcPileType Inherits IfcDeepFoundationType
    Public PredefinedType As IfcPileTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcPileTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPileTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
