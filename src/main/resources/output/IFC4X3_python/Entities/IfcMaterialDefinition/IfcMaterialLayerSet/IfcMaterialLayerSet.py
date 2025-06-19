from typing import List

class IfcMaterialLayerSet(IfcMaterialDefinition):
    def __init__(self):
        self.MaterialLayers: List[IfcMaterialLayer] = None
        self.LayerSetName: IfcLabel = None
        self.Description: IfcText = None

    # === DERIVE CLAUSES ===
    # TotalThickness : IfcLengthMeasure := IfcMlsTotalThickness(SELF)
