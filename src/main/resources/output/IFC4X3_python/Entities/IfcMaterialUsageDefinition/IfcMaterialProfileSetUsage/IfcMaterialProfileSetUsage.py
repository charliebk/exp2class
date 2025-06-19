class IfcMaterialProfileSetUsage(IfcMaterialUsageDefinition):
    def __init__(self):
        self.ForProfileSet: IfcMaterialProfileSet = None
        self.CardinalPoint: IfcCardinalPointReference = None
        self.ReferenceExtent: IfcPositiveLengthMeasure = None

    # === EXTENDED BY ===
    # IfcMaterialProfileSetUsageTapering
