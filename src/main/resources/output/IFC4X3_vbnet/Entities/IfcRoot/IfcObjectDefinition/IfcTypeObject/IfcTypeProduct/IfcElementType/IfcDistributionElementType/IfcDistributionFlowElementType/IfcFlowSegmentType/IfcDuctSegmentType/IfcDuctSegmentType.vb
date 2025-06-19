Public Class IfcDuctSegmentType Inherits IfcFlowSegmentType
    Public PredefinedType As IfcDuctSegmentTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcDuctSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
