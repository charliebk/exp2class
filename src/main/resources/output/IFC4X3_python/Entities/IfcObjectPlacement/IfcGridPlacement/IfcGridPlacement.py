class IfcGridPlacement(IfcObjectPlacement):
    def __init__(self):
        self.PlacementLocation: IfcVirtualGridIntersection = None
        self.PlacementRefDirection: IfcGridPlacementDirectionSelect = None
