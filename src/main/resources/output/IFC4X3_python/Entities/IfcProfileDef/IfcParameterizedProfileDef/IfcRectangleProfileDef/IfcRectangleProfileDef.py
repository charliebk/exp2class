class IfcRectangleProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.XDim: IfcPositiveLengthMeasure = None
        self.YDim: IfcPositiveLengthMeasure = None

    # === EXTENDED BY ===
    # IfcRectangleHollowProfileDef
    # IfcRoundedRectangleProfileDef
