class IfcMaterialProfileWithOffsets(IfcMaterialProfile):
    def __init__(self):
        self.OffsetValues: ARRAY [1:2] OF IfcLengthMeasure = None
