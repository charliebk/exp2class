class IfcRelServicesBuildings(IfcRelConnects):
    def __init__(self):
        self.RelatingSystem: IfcSystem = None
        self.RelatedBuildings: SET [1:?] OF IfcSpatialElement = None
