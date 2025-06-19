class IfcMaterialProfileSetUsageTapering(IfcMaterialProfileSetUsage):
    def __init__(self):
        self.ForProfileEndSet: IfcMaterialProfileSet = None
        self.CardinalEndPoint: IfcCardinalPointReference = None
