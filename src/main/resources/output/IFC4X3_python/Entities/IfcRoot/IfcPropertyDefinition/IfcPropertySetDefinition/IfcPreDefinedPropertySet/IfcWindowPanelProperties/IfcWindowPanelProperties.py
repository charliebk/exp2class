class IfcWindowPanelProperties(IfcPreDefinedPropertySet):
    def __init__(self):
        self.OperationType: IfcWindowPanelOperationEnum = None
        self.PanelPosition: IfcWindowPanelPositionEnum = None
        self.FrameDepth: IfcPositiveLengthMeasure = None
        self.FrameThickness: IfcPositiveLengthMeasure = None
        self.ShapeAspectStyle: IfcShapeAspect = None

    # === WHERE CLAUSES ===
    # ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
