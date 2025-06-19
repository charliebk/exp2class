class IfcStructuralPointConnection(IfcStructuralConnection):
    def __init__(self):
        self.ConditionCoordinateSystem: IfcAxis2Placement3D = None
