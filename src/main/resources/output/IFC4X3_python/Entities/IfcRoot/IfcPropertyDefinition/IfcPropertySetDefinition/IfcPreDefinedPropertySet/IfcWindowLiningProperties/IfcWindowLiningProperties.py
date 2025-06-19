class IfcWindowLiningProperties(IfcPreDefinedPropertySet):
    def __init__(self):
        self.LiningDepth: IfcPositiveLengthMeasure = None
        self.LiningThickness: IfcNonNegativeLengthMeasure = None
        self.TransomThickness: IfcNonNegativeLengthMeasure = None
        self.MullionThickness: IfcNonNegativeLengthMeasure = None
        self.FirstTransomOffset: IfcNormalisedRatioMeasure = None
        self.SecondTransomOffset: IfcNormalisedRatioMeasure = None
        self.FirstMullionOffset: IfcNormalisedRatioMeasure = None
        self.SecondMullionOffset: IfcNormalisedRatioMeasure = None
        self.ShapeAspectStyle: IfcShapeAspect = None
        self.LiningOffset: IfcLengthMeasure = None
        self.LiningToPanelOffsetX: IfcLengthMeasure = None
        self.LiningToPanelOffsetY: IfcLengthMeasure = None

    # === WHERE CLAUSES ===
    # WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    # WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset))
    # WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset))
    # WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
