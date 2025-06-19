class IfcCsgPrimitive3D(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Position: IfcAxis2Placement3D = None

    # === EXTENDED BY ===
    # IfcBlock
    # IfcRectangularPyramid
    # IfcRightCircularCone
    # IfcRightCircularCylinder
    # IfcSphere

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := 3
