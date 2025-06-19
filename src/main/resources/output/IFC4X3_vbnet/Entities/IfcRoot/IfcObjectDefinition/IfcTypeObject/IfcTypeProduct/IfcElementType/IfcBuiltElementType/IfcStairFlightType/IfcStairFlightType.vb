Public Class IfcStairFlightType Inherits IfcBuiltElementType
    Public PredefinedType As IfcStairFlightTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
