class IfcDoorLiningProperties(IfcPreDefinedPropertySet):
    def __init__(self):
        self.LiningDepth: IfcPositiveLengthMeasure = None
        self.LiningThickness: IfcNonNegativeLengthMeasure = None
        self.ThresholdDepth: IfcPositiveLengthMeasure = None
        self.ThresholdThickness: IfcNonNegativeLengthMeasure = None
        self.TransomThickness: IfcNonNegativeLengthMeasure = None
        self.TransomOffset: IfcLengthMeasure = None
        self.LiningOffset: IfcLengthMeasure = None
        self.ThresholdOffset: IfcLengthMeasure = None
        self.CasingThickness: IfcPositiveLengthMeasure = None
        self.CasingDepth: IfcPositiveLengthMeasure = None
        self.ShapeAspectStyle: IfcShapeAspect = None
        self.LiningToPanelOffsetX: IfcLengthMeasure = None
        self.LiningToPanelOffsetY: IfcLengthMeasure = None

    # === WHERE CLAUSES ===
    # WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    # WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)))
    # WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)))
    # WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)))
    # WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
