class IfcDoorPanelProperties(IfcPreDefinedPropertySet):
    def __init__(self):
        self.PanelDepth: IfcPositiveLengthMeasure = None
        self.PanelOperation: IfcDoorPanelOperationEnum = None
        self.PanelWidth: IfcNormalisedRatioMeasure = None
        self.PanelPosition: IfcDoorPanelPositionEnum = None
        self.ShapeAspectStyle: IfcShapeAspect = None

    # === WHERE CLAUSES ===
    # ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
