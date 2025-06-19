class IfcLinearPlacement(IfcObjectPlacement):
    def __init__(self):
        self.RelativePlacement: IfcAxis2PlacementLinear = None
        self.CartesianPosition: IfcAxis2Placement3D = None
