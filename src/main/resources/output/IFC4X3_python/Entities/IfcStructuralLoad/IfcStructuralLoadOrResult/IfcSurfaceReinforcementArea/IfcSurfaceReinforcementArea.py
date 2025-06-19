from typing import List

class IfcSurfaceReinforcementArea(IfcStructuralLoadOrResult):
    def __init__(self):
        self.SurfaceReinforcement1: List[IfcLengthMeasure] = None
        self.SurfaceReinforcement2: List[IfcLengthMeasure] = None
        self.ShearReinforcement: IfcRatioMeasure = None

    # === WHERE CLAUSES ===
    # NonnegativeArea1 : (NOT EXISTS(SurfaceReinforcement1)) OR ( (SurfaceReinforcement1[1] >= 0.) AND (SurfaceReinforcement1[2] >= 0.) AND ((SIZEOF(SurfaceReinforcement1) = 1) OR (SurfaceReinforcement1[1] >= 0.)) )
    # NonnegativeArea2 : (NOT EXISTS(SurfaceReinforcement2)) OR ( (SurfaceReinforcement2[1] >= 0.) AND (SurfaceReinforcement2[2] >= 0.) AND ((SIZEOF(SurfaceReinforcement2) = 1) OR (SurfaceReinforcement2[1] >= 0.)) )
    # NonnegativeArea3 : (NOT EXISTS(ShearReinforcement)) OR (ShearReinforcement >= 0.)
    # SurfaceAndOrShearAreaSpecified : EXISTS(SurfaceReinforcement1) OR EXISTS(SurfaceReinforcement2) OR EXISTS(ShearReinforcement)
