class IfcStructuralLoadSingleDisplacement(IfcStructuralLoadStatic):
    def __init__(self):
        self.DisplacementX: IfcLengthMeasure = None
        self.DisplacementY: IfcLengthMeasure = None
        self.DisplacementZ: IfcLengthMeasure = None
        self.RotationalDisplacementRX: IfcPlaneAngleMeasure = None
        self.RotationalDisplacementRY: IfcPlaneAngleMeasure = None
        self.RotationalDisplacementRZ: IfcPlaneAngleMeasure = None

    # === EXTENDED BY ===
    # IfcStructuralLoadSingleDisplacementDistortion
