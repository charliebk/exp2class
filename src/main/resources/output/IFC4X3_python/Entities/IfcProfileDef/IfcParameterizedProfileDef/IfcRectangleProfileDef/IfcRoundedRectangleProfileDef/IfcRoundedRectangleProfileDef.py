class IfcRoundedRectangleProfileDef(IfcRectangleProfileDef):
    def __init__(self):
        self.RoundingRadius: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
