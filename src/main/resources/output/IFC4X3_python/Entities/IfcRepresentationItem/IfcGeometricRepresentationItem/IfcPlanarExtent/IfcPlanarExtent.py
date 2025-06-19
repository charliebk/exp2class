class IfcPlanarExtent(IfcGeometricRepresentationItem):
    def __init__(self):
        self.SizeInX: IfcLengthMeasure = None
        self.SizeInY: IfcLengthMeasure = None

    # === EXTENDED BY ===
    # IfcPlanarBox
