Public Class IfcRampFlightType Inherits IfcBuiltElementType
    Public PredefinedType As IfcRampFlightTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcRampFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
