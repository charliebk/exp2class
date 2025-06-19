Public Class IfcBSplineSurfaceWithKnots Inherits IfcBSplineSurface
    Public UMultiplicities As List(Of IfcInteger)
    Public VMultiplicities As List(Of IfcInteger)
    Public UKnots As List(Of IfcParameterValue)
    Public VKnots As List(Of IfcParameterValue)
    Public KnotSpec As IfcKnotType

    ' === EXTENDED BY ===
    ' IfcRationalBSplineSurfaceWithKnots

    ' === WHERE CLAUSES ===
    ' CorrespondingULists : SIZEOF(UMultiplicities) = KnotUUpper
    ' CorrespondingVLists : SIZEOF(VMultiplicities) = KnotVUpper
    ' UDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.UDegree, KnotUUpper, SELF\IfcBSplineSurface.UUpper, UMultiplicities, UKnots)
    ' VDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.VDegree, KnotVUpper, SELF\IfcBSplineSurface.VUpper, VMultiplicities, VKnots)

    ' === DERIVE CLAUSES ===
    ' KnotVUpper : IfcInteger := SIZEOF(VKnots)
    ' KnotUUpper : IfcInteger := SIZEOF(UKnots)
End Class
