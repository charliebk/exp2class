from typing import List

class IfcLightDistributionData:
    def __init__(self):
        self.MainPlaneAngle: IfcPlaneAngleMeasure = None
        self.SecondaryPlaneAngle: List[IfcPlaneAngleMeasure] = None
        self.LuminousIntensity: List[IfcLuminousIntensityDistributionMeasure] = None
