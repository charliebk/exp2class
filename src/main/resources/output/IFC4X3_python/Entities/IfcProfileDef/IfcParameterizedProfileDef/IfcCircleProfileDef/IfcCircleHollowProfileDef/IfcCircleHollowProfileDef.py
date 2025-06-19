class IfcCircleHollowProfileDef(IfcCircleProfileDef):
    def __init__(self):
        self.WallThickness: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # WR1 : WallThickness < SELF\IfcCircleProfileDef.Radius
