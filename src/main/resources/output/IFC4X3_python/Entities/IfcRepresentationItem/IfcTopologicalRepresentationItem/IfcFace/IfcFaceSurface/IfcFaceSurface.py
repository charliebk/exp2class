class IfcFaceSurface(IfcFace):
    def __init__(self):
        self.FaceSurface: IfcSurface = None
        self.SameSense: IfcBoolean = None

    # === EXTENDED BY ===
    # IfcAdvancedFace
