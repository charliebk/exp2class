class IfcMaterialLayer(IfcMaterialDefinition):
    def __init__(self):
        self.Material: IfcMaterial = None
        self.LayerThickness: IfcNonNegativeLengthMeasure = None
        self.IsVentilated: IfcLogical = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Category: IfcLabel = None
        self.Priority: IfcInteger = None

    # === EXTENDED BY ===
    # IfcMaterialLayerWithOffsets

    # === INVERSE CLAUSES ===
    # ToMaterialLayerSet : IfcMaterialLayerSet FOR MaterialLayers

    # === WHERE CLAUSES ===
    # NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
