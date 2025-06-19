class IfcEdge(IfcTopologicalRepresentationItem):
    def __init__(self):
        self.EdgeStart: IfcVertex = None
        self.EdgeEnd: IfcVertex = None

    # === EXTENDED BY ===
    # IfcEdgeCurve
    # IfcOrientedEdge
    # IfcSubedge
