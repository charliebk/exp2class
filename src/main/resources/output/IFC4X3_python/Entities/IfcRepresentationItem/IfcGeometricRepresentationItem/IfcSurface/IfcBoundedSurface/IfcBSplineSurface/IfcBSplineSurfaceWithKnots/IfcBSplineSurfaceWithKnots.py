from typing import List

class IfcBSplineSurfaceWithKnots(IfcBSplineSurface):
    def __init__(self):
        self.UMultiplicities: List[IfcInteger] = None
        self.VMultiplicities: List[IfcInteger] = None
        self.UKnots: List[IfcParameterValue] = None
        self.VKnots: List[IfcParameterValue] = None
        self.KnotSpec: IfcKnotType = None

    # === EXTENDED BY ===
    # IfcRationalBSplineSurfaceWithKnots

    # === WHERE CLAUSES ===
    # CorrespondingULists : SIZEOF(UMultiplicities) = KnotUUpper
    # CorrespondingVLists : SIZEOF(VMultiplicities) = KnotVUpper
    # UDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.UDegree, KnotUUpper, SELF\IfcBSplineSurface.UUpper, UMultiplicities, UKnots)
    # VDirectionConstraints : IfcConstraintsParamBSpline ( SELF\IfcBSplineSurface.VDegree, KnotVUpper, SELF\IfcBSplineSurface.VUpper, VMultiplicities, VKnots)

    # === DERIVE CLAUSES ===
    # KnotVUpper : IfcInteger := SIZEOF(VKnots)
    # KnotUUpper : IfcInteger := SIZEOF(UKnots)
