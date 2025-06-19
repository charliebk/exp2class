class IfcCShapeProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.Depth: IfcPositiveLengthMeasure = None
        self.Width: IfcPositiveLengthMeasure = None
        self.WallThickness: IfcPositiveLengthMeasure = None
        self.Girth: IfcPositiveLengthMeasure = None
        self.InternalFilletRadius: IfcNonNegativeLengthMeasure = None

    # === WHERE CLAUSES ===
    # ValidGirth : Girth < (Depth / 2.)
    # ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness))
    # ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.)
