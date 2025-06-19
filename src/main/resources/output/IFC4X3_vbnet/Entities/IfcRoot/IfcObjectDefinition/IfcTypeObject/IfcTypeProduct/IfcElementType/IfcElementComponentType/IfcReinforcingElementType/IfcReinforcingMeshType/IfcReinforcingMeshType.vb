Public Class IfcReinforcingMeshType Inherits IfcReinforcingElementType
    Public PredefinedType As IfcReinforcingMeshTypeEnum
    Public MeshLength As IfcPositiveLengthMeasure
    Public MeshWidth As IfcPositiveLengthMeasure
    Public LongitudinalBarNominalDiameter As IfcPositiveLengthMeasure
    Public TransverseBarNominalDiameter As IfcPositiveLengthMeasure
    Public LongitudinalBarCrossSectionArea As IfcAreaMeasure
    Public TransverseBarCrossSectionArea As IfcAreaMeasure
    Public LongitudinalBarSpacing As IfcPositiveLengthMeasure
    Public TransverseBarSpacing As IfcPositiveLengthMeasure
    Public BendingShapeCode As IfcLabel
    Public BendingParameters As List(Of IfcBendingParameterSelect)

    ' === WHERE CLAUSES ===
    ' BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    ' CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
