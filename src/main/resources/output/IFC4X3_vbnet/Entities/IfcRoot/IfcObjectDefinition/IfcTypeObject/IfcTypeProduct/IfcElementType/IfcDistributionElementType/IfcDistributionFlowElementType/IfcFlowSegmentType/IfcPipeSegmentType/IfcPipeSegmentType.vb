Public Class IfcPipeSegmentType Inherits IfcFlowSegmentType
    Public PredefinedType As IfcPipeSegmentTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcPipeSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
