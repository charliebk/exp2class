public class IfcDoorLiningProperties : IfcPreDefinedPropertySet
{
    public IfcPositiveLengthMeasure LiningDepth { get; set; }
    public IfcNonNegativeLengthMeasure LiningThickness { get; set; }
    public IfcPositiveLengthMeasure ThresholdDepth { get; set; }
    public IfcNonNegativeLengthMeasure ThresholdThickness { get; set; }
    public IfcNonNegativeLengthMeasure TransomThickness { get; set; }
    public IfcLengthMeasure TransomOffset { get; set; }
    public IfcLengthMeasure LiningOffset { get; set; }
    public IfcLengthMeasure ThresholdOffset { get; set; }
    public IfcPositiveLengthMeasure CasingThickness { get; set; }
    public IfcPositiveLengthMeasure CasingDepth { get; set; }
    public IfcShapeAspect ShapeAspectStyle { get; set; }
    public IfcLengthMeasure LiningToPanelOffsetX { get; set; }
    public IfcLengthMeasure LiningToPanelOffsetY { get; set; }

    // === WHERE CLAUSES ===
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    // WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)))
    // WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)))
    // WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)))
    // WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
