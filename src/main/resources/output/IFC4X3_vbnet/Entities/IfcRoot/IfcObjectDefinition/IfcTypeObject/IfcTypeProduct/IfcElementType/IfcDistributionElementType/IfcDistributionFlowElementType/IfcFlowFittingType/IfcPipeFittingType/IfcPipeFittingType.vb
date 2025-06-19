Public Class IfcPipeFittingType Inherits IfcFlowFittingType
    Public PredefinedType As IfcPipeFittingTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcPipeFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
