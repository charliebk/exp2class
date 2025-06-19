class IfcBuilding(IfcFacility):
    def __init__(self):
        self.ElevationOfRefHeight: IfcLengthMeasure = None
        self.ElevationOfTerrain: IfcLengthMeasure = None
        self.BuildingAddress: IfcPostalAddress = None
