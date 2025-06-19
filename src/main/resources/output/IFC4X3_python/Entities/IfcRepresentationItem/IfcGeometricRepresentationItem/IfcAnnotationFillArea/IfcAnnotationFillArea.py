class IfcAnnotationFillArea(IfcGeometricRepresentationItem):
    def __init__(self):
        self.OuterBoundary: IfcCurve = None
        self.InnerBoundaries: SET [1:?] OF IfcCurve = None
