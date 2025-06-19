class IfcMaterialLayerSetUsage(IfcMaterialUsageDefinition):
    def __init__(self):
        self.ForLayerSet: IfcMaterialLayerSet = None
        self.LayerSetDirection: IfcLayerSetDirectionEnum = None
        self.DirectionSense: IfcDirectionSenseEnum = None
        self.OffsetFromReferenceLine: IfcLengthMeasure = None
        self.ReferenceExtent: IfcPositiveLengthMeasure = None
