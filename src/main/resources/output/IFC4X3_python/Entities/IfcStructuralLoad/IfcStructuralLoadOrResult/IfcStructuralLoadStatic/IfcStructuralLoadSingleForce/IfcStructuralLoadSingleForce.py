class IfcStructuralLoadSingleForce(IfcStructuralLoadStatic):
    def __init__(self):
        self.ForceX: IfcForceMeasure = None
        self.ForceY: IfcForceMeasure = None
        self.ForceZ: IfcForceMeasure = None
        self.MomentX: IfcTorqueMeasure = None
        self.MomentY: IfcTorqueMeasure = None
        self.MomentZ: IfcTorqueMeasure = None

    # === EXTENDED BY ===
    # IfcStructuralLoadSingleForceWarping
