Public Class IfcPolygonalBoundedHalfSpace Inherits IfcHalfSpaceSolid
    Public Position As IfcAxis2Placement3D
    Public PolygonalBoundary As IfcBoundedCurve

    ' === WHERE CLAUSES ===
    ' BoundaryDim : PolygonalBoundary.Dim = 2
    ' BoundaryType : SIZEOF(TYPEOF(PolygonalBoundary) * [ 'IFC4X3_DEV_73740fe4.IFCPOLYLINE', 'IFC4X3_DEV_73740fe4.IFCCOMPOSITECURVE', 'IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE' ]) = 1
End Class
