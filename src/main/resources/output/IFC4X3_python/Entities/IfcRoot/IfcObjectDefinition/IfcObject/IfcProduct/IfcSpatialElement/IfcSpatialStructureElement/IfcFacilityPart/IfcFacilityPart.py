class IfcFacilityPart(IfcSpatialStructureElement):
    def __init__(self):
        self.UsageType: IfcFacilityUsageEnum = None

    # === EXTENDED BY ===
    # IfcBridgePart
    # IfcFacilityPartCommon
    # IfcMarinePart
    # IfcRailwayPart
    # IfcRoadPart
