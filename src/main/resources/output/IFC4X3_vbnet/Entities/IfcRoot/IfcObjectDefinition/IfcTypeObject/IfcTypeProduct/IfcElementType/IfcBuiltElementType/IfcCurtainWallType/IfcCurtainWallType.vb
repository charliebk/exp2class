Public Class IfcCurtainWallType Inherits IfcBuiltElementType
    Public PredefinedType As IfcCurtainWallTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCurtainWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCurtainWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
