class IfcPermeableCoveringProperties(IfcPreDefinedPropertySet):
    def __init__(self):
        self.OperationType: IfcPermeableCoveringOperationEnum = None
        self.PanelPosition: IfcWindowPanelPositionEnum = None
        self.FrameDepth: IfcPositiveLengthMeasure = None
        self.FrameThickness: IfcPositiveLengthMeasure = None
        self.ShapeAspectStyle: IfcShapeAspect = None
