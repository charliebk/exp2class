from typing import List

class IfcBSplineSurface(IfcBoundedSurface):
    def __init__(self):
        self.UDegree: IfcInteger = None
        self.VDegree: IfcInteger = None
        self.ControlPointsList: List[List[IfcCartesianPoint]] = None
        self.SurfaceForm: IfcBSplineSurfaceForm = None
        self.UClosed: IfcLogical = None
        self.VClosed: IfcLogical = None
        self.SelfIntersect: IfcLogical = None

    # === EXTENDED BY ===
    # IfcBSplineSurfaceWithKnots

    # === DERIVE CLAUSES ===
    # UUpper : IfcInteger := SIZEOF(ControlPointsList) - 1
    # VUpper : IfcInteger := SIZEOF(ControlPointsList[1]) - 1
    # ControlPoints : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcCartesianPoint := IfcMakeArrayOfArray(ControlPointsList, 0,UUpper,0,VUpper)
