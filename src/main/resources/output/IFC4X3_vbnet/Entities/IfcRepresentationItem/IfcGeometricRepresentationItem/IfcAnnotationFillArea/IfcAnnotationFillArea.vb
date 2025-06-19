Public Class IfcAnnotationFillArea Inherits IfcGeometricRepresentationItem
    Public OuterBoundary As IfcCurve
    Public InnerBoundaries As SET [1:?] OF IfcCurve
End Class
