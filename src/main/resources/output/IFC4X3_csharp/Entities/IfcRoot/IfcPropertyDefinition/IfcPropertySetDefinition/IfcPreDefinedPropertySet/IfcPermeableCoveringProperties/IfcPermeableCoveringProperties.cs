public class IfcPermeableCoveringProperties : IfcPreDefinedPropertySet
{
    public IfcPermeableCoveringOperationEnum OperationType { get; set; }
    public IfcWindowPanelPositionEnum PanelPosition { get; set; }
    public IfcPositiveLengthMeasure FrameDepth { get; set; }
    public IfcPositiveLengthMeasure FrameThickness { get; set; }
    public IfcShapeAspect ShapeAspectStyle { get; set; }
}
