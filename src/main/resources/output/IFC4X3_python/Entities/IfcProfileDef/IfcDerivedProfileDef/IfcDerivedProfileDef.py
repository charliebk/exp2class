class IfcDerivedProfileDef(IfcProfileDef):
    def __init__(self):
        self.ParentProfile: IfcProfileDef = None
        self.Operator: IfcCartesianTransformationOperator2D = None
        self.Label: IfcLabel = None

    # === EXTENDED BY ===
    # IfcMirroredProfileDef

    # === WHERE CLAUSES ===
    # InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType
