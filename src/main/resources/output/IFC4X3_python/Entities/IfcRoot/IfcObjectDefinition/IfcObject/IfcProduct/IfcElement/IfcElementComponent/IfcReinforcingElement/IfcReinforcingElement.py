class IfcReinforcingElement(IfcElementComponent):
    def __init__(self):
        self.SteelGrade: IfcLabel = None

    # === EXTENDED BY ===
    # IfcReinforcingBar
    # IfcReinforcingMesh
    # IfcTendon
    # IfcTendonAnchor
    # IfcTendonConduit
