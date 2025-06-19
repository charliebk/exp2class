public class IfcWindowPanelProperties : IfcPreDefinedPropertySet
{
    public IfcWindowPanelOperationEnum OperationType { get; set; }
    public IfcWindowPanelPositionEnum PanelPosition { get; set; }
    public IfcPositiveLengthMeasure FrameDepth { get; set; }
    public IfcPositiveLengthMeasure FrameThickness { get; set; }
    public IfcShapeAspect ShapeAspectStyle { get; set; }

    // === WHERE CLAUSES ===
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
