Public Class IfcDistributionChamberElementType Inherits IfcDistributionFlowElementType
    Public PredefinedType As IfcDistributionChamberElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
