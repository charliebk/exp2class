Public Class IfcCurveBoundedSurface Inherits IfcBoundedSurface
    Public BasisSurface As IfcSurface
    Public Boundaries As SET [1:?] OF IfcBoundaryCurve
    Public ImplicitOuter As IfcBoolean
End Class
