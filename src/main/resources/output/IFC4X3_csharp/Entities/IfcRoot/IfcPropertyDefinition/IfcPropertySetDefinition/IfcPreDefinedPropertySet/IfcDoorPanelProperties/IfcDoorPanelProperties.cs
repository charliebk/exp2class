public class IfcDoorPanelProperties : IfcPreDefinedPropertySet
{
    public IfcPositiveLengthMeasure PanelDepth { get; set; }
    public IfcDoorPanelOperationEnum PanelOperation { get; set; }
    public IfcNormalisedRatioMeasure PanelWidth { get; set; }
    public IfcDoorPanelPositionEnum PanelPosition { get; set; }
    public IfcShapeAspect ShapeAspectStyle { get; set; }

    // === WHERE CLAUSES ===
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
