class IfcSeamCurve(IfcSurfaceCurve):
    def __init__(self):
        pass

    # === WHERE CLAUSES ===
    # SameSurface : IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[1]) = IfcAssociatedSurface(SELF\IfcSurfaceCurve.AssociatedGeometry[2])
    # TwoPCurves : SIZEOF(SELF\IfcSurfaceCurve.AssociatedGeometry) = 2
