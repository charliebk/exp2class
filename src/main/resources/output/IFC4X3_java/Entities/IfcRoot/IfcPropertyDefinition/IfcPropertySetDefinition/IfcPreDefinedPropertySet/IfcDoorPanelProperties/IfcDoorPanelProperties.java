public class IfcDoorPanelProperties extends IfcPreDefinedPropertySet {
    public IfcPositiveLengthMeasure PanelDepth;
    public IfcDoorPanelOperationEnum PanelOperation;
    public IfcNormalisedRatioMeasure PanelWidth;
    public IfcDoorPanelPositionEnum PanelPosition;
    public IfcShapeAspect ShapeAspectStyle;

    // === WHERE CLAUSES ===
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
