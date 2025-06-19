Public Class IfcCableSegmentType Inherits IfcFlowSegmentType
    Public PredefinedType As IfcCableSegmentTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcCableSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
