Public Class IfcRationalBSplineSurfaceWithKnots Inherits IfcBSplineSurfaceWithKnots
    Public WeightsData As List(Of List(Of IfcReal))

    ' === WHERE CLAUSES ===
    ' CorrespondingWeightsDataLists : (SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineSurface.ControlPointsList)) AND (SIZEOF(WeightsData[1]) = SIZEOF(SELF\IfcBSplineSurface.ControlPointsList[1]))
    ' WeightValuesGreaterZero : IfcSurfaceWeightsPositive(SELF)

    ' === DERIVE CLAUSES ===
    ' Weights : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcReal := IfcMakeArrayOfArray(WeightsData,0,UUpper,0,VUpper)
End Class
