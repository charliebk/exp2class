Public Class IfcValveType Inherits IfcFlowControllerType
    Public PredefinedType As IfcValveTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
