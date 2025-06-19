class IfcStructuralLoadLinearForce(IfcStructuralLoadStatic):
    def __init__(self):
        self.LinearForceX: IfcLinearForceMeasure = None
        self.LinearForceY: IfcLinearForceMeasure = None
        self.LinearForceZ: IfcLinearForceMeasure = None
        self.LinearMomentX: IfcLinearMomentMeasure = None
        self.LinearMomentY: IfcLinearMomentMeasure = None
        self.LinearMomentZ: IfcLinearMomentMeasure = None
