class IfcBoundaryNodeCondition(IfcBoundaryCondition):
    def __init__(self):
        self.TranslationalStiffnessX: IfcTranslationalStiffnessSelect = None
        self.TranslationalStiffnessY: IfcTranslationalStiffnessSelect = None
        self.TranslationalStiffnessZ: IfcTranslationalStiffnessSelect = None
        self.RotationalStiffnessX: IfcRotationalStiffnessSelect = None
        self.RotationalStiffnessY: IfcRotationalStiffnessSelect = None
        self.RotationalStiffnessZ: IfcRotationalStiffnessSelect = None

    # === EXTENDED BY ===
    # IfcBoundaryNodeConditionWarping
