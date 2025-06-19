public class IfcDoorLiningProperties extends IfcPreDefinedPropertySet {
    public IfcPositiveLengthMeasure LiningDepth;
    public IfcNonNegativeLengthMeasure LiningThickness;
    public IfcPositiveLengthMeasure ThresholdDepth;
    public IfcNonNegativeLengthMeasure ThresholdThickness;
    public IfcNonNegativeLengthMeasure TransomThickness;
    public IfcLengthMeasure TransomOffset;
    public IfcLengthMeasure LiningOffset;
    public IfcLengthMeasure ThresholdOffset;
    public IfcPositiveLengthMeasure CasingThickness;
    public IfcPositiveLengthMeasure CasingDepth;
    public IfcShapeAspect ShapeAspectStyle;
    public IfcLengthMeasure LiningToPanelOffsetX;
    public IfcLengthMeasure LiningToPanelOffsetY;

    // === WHERE CLAUSES ===
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    // WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)))
    // WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)))
    // WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)))
    // WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
