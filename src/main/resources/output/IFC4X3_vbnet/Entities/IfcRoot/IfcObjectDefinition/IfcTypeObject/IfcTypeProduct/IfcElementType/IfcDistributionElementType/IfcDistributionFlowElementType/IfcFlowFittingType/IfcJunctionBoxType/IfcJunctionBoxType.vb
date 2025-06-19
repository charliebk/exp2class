Public Class IfcJunctionBoxType Inherits IfcFlowFittingType
    Public PredefinedType As IfcJunctionBoxTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcJunctionBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcJunctionBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
