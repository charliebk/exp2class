Public Class IfcSegment Inherits IfcGeometricRepresentationItem
    Public Transition As IfcTransitionCode

    ' === EXTENDED BY ===
    ' IfcCompositeCurveSegment
    ' IfcCurveSegment

    ' === INVERSE CLAUSES ===
    ' UsingCurves : SET [1:?] OF IfcCompositeCurve FOR Segments

    ' === DERIVE CLAUSES ===
    ' Dim : IfcDimensionCount := IfcSegmentDim(SELF)
End Class
