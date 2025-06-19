public class IfcWindowLiningProperties : IfcPreDefinedPropertySet
{
    public IfcPositiveLengthMeasure LiningDepth { get; set; }
    public IfcNonNegativeLengthMeasure LiningThickness { get; set; }
    public IfcNonNegativeLengthMeasure TransomThickness { get; set; }
    public IfcNonNegativeLengthMeasure MullionThickness { get; set; }
    public IfcNormalisedRatioMeasure FirstTransomOffset { get; set; }
    public IfcNormalisedRatioMeasure SecondTransomOffset { get; set; }
    public IfcNormalisedRatioMeasure FirstMullionOffset { get; set; }
    public IfcNormalisedRatioMeasure SecondMullionOffset { get; set; }
    public IfcShapeAspect ShapeAspectStyle { get; set; }
    public IfcLengthMeasure LiningOffset { get; set; }
    public IfcLengthMeasure LiningToPanelOffsetX { get; set; }
    public IfcLengthMeasure LiningToPanelOffsetY { get; set; }

    // === WHERE CLAUSES ===
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    // WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset))
    // WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset))
    // WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
