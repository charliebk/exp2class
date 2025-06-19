class IfcStructuralLoadSingleForceWarping(IfcStructuralLoadSingleForce):
    def __init__(self):
        self.WarpingMoment: IfcWarpingMomentMeasure = None
