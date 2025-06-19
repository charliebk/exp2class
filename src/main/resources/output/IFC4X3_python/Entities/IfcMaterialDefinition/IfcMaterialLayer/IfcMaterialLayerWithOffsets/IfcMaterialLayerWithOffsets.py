class IfcMaterialLayerWithOffsets(IfcMaterialLayer):
    def __init__(self):
        self.OffsetDirection: IfcLayerSetDirectionEnum = None
        self.OffsetValues: ARRAY [1:2] OF IfcLengthMeasure = None
