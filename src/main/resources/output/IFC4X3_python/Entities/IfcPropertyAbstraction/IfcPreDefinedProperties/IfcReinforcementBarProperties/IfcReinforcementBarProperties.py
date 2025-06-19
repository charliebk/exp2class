class IfcReinforcementBarProperties(IfcPreDefinedProperties):
    def __init__(self):
        self.TotalCrossSectionArea: IfcAreaMeasure = None
        self.SteelGrade: IfcLabel = None
        self.BarSurface: IfcReinforcingBarSurfaceEnum = None
        self.EffectiveDepth: IfcLengthMeasure = None
        self.NominalBarDiameter: IfcPositiveLengthMeasure = None
        self.BarCount: IfcCountMeasure = None
