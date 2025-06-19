Public Class IfcTrackElementType Inherits IfcBuiltElementType
    Public PredefinedType As IfcTrackElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTrackElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTrackElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
