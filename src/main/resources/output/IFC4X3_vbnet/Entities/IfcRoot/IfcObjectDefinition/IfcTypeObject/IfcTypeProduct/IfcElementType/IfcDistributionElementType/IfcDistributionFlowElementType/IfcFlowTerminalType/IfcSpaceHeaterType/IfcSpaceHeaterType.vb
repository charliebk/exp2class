Public Class IfcSpaceHeaterType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcSpaceHeaterTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
