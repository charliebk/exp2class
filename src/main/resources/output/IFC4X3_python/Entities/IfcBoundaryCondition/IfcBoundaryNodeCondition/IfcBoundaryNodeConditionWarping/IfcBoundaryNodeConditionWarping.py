class IfcBoundaryNodeConditionWarping(IfcBoundaryNodeCondition):
    def __init__(self):
        self.WarpingStiffness: IfcWarpingStiffnessSelect = None
