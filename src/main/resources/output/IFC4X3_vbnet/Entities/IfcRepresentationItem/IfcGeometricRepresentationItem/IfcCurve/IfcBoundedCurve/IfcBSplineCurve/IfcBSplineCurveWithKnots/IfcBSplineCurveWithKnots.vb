Public Class IfcBSplineCurveWithKnots Inherits IfcBSplineCurve
    Public KnotMultiplicities As List(Of IfcInteger)
    Public Knots As List(Of IfcParameterValue)
    Public KnotSpec As IfcKnotType

    ' === EXTENDED BY ===
    ' IfcRationalBSplineCurveWithKnots

    ' === WHERE CLAUSES ===
    ' ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots, UpperIndexOnControlPoints, KnotMultiplicities, Knots)
    ' CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots

    ' === DERIVE CLAUSES ===
    ' UpperIndexOnKnots : IfcInteger := SIZEOF(Knots)
End Class
