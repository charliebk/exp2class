from typing import List

class IfcLightIntensityDistribution:
    def __init__(self):
        self.LightDistributionCurve: IfcLightDistributionCurveEnum = None
        self.DistributionData: List[IfcLightDistributionData] = None
