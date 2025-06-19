class IfcPolygonalBoundedHalfSpace(IfcHalfSpaceSolid):
    def __init__(self):
        self.Position: IfcAxis2Placement3D = None
        self.PolygonalBoundary: IfcBoundedCurve = None

    # === WHERE CLAUSES ===
    # BoundaryDim : PolygonalBoundary.Dim = 2
    # BoundaryType : SIZEOF(TYPEOF(PolygonalBoundary) * [ 'IFC4X3_DEV_73740fe4.IFCPOLYLINE', 'IFC4X3_DEV_73740fe4.IFCCOMPOSITECURVE', 'IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE' ]) = 1
