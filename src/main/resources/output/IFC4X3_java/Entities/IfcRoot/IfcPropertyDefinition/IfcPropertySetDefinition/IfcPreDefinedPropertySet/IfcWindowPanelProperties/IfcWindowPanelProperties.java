public class IfcWindowPanelProperties extends IfcPreDefinedPropertySet {
    public IfcWindowPanelOperationEnum OperationType;
    public IfcWindowPanelPositionEnum PanelPosition;
    public IfcPositiveLengthMeasure FrameDepth;
    public IfcPositiveLengthMeasure FrameThickness;
    public IfcShapeAspect ShapeAspectStyle;

    // === WHERE CLAUSES ===
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
