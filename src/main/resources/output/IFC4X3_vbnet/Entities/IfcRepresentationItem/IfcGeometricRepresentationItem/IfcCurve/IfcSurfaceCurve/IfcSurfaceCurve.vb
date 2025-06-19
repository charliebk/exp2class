Public Class IfcSurfaceCurve Inherits IfcCurve
    Public Curve3D As IfcCurve
    Public AssociatedGeometry As List(Of IfcPcurve)
    Public MasterRepresentation As IfcPreferredSurfaceCurveRepresentation

    ' === EXTENDED BY ===
    ' IfcIntersectionCurve
    ' IfcSeamCurve

    ' === WHERE CLAUSES ===
    ' CurveIs3D : Curve3D.Dim = 3
    ' CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D))

    ' === DERIVE CLAUSES ===
    ' BasisSurface : SET [1:2] OF IfcSurface := IfcGetBasisSurface(SELF)
End Class
