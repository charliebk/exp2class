class IfcIntersectionCurve(IfcSurfaceCurve):
    def __init__(self):
        pass

    # === WHERE CLAUSES ===
    # DistinctSurfaces : IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[1]) <> IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[2])
    # TwoPCurves : SIZEOF(SELF\IfcSurfaceCurve.AssociatedGeometry) = 2
