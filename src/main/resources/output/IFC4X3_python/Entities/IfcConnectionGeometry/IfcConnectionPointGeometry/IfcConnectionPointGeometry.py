class IfcConnectionPointGeometry(IfcConnectionGeometry):
    def __init__(self):
        self.PointOnRelatingElement: IfcPointOrVertexPoint = None
        self.PointOnRelatedElement: IfcPointOrVertexPoint = None

    # === EXTENDED BY ===
    # IfcConnectionPointEccentricity
