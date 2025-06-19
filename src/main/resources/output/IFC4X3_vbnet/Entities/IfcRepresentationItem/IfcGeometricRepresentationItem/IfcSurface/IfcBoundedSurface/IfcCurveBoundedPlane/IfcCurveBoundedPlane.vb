Public Class IfcCurveBoundedPlane Inherits IfcBoundedSurface
    Public BasisSurface As IfcPlane
    Public OuterBoundary As IfcCurve
    Public InnerBoundaries As SET [0:?] OF IfcCurve
End Class
