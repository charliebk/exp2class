class IfcStructuralLoadPlanarForce(IfcStructuralLoadStatic):
    def __init__(self):
        self.PlanarForceX: IfcPlanarForceMeasure = None
        self.PlanarForceY: IfcPlanarForceMeasure = None
        self.PlanarForceZ: IfcPlanarForceMeasure = None
