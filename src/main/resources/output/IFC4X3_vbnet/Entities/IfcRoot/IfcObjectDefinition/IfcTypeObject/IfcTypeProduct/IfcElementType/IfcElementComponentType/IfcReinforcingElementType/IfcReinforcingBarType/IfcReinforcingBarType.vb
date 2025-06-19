Public Class IfcReinforcingBarType Inherits IfcReinforcingElementType
    Public PredefinedType As IfcReinforcingBarTypeEnum
    Public NominalDiameter As IfcPositiveLengthMeasure
    Public CrossSectionArea As IfcAreaMeasure
    Public BarLength As IfcPositiveLengthMeasure
    Public BarSurface As IfcReinforcingBarSurfaceEnum
    Public BendingShapeCode As IfcLabel
    Public BendingParameters As List(Of IfcBendingParameterSelect)

    ' === WHERE CLAUSES ===
    ' BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    ' CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
