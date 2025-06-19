from typing import List

class IfcSurfaceCurve(IfcCurve):
    def __init__(self):
        self.Curve3D: IfcCurve = None
        self.AssociatedGeometry: List[IfcPcurve] = None
        self.MasterRepresentation: IfcPreferredSurfaceCurveRepresentation = None

    # === EXTENDED BY ===
    # IfcIntersectionCurve
    # IfcSeamCurve

    # === WHERE CLAUSES ===
    # CurveIs3D : Curve3D.Dim = 3
    # CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D))

    # === DERIVE CLAUSES ===
    # BasisSurface : SET [1:2] OF IfcSurface := IfcGetBasisSurface(SELF)
