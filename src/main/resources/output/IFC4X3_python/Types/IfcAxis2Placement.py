# SELECT TYPE IfcAxis2Placement
# Options:
# - IfcAxis2Placement2D
# - IfcAxis2Placement3D
class IfcAxis2Placement:
    def __init__(self, value):
        if not isinstance(value, (IfcAxis2Placement2D, IfcAxis2Placement3D)):
            raise TypeError("value must be one of: IfcAxis2Placement2D, IfcAxis2Placement3D")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
