Public Class IfcConveyorSegmentType Inherits IfcFlowSegmentType
    Public PredefinedType As IfcConveyorSegmentTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
