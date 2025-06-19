Public Class IfcLightFixtureType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcLightFixtureTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcLightFixtureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLightFixtureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
