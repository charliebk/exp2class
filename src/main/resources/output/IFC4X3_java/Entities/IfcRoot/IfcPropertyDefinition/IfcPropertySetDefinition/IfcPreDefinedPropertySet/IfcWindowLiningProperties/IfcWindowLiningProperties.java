public class IfcWindowLiningProperties extends IfcPreDefinedPropertySet {
    public IfcPositiveLengthMeasure LiningDepth;
    public IfcNonNegativeLengthMeasure LiningThickness;
    public IfcNonNegativeLengthMeasure TransomThickness;
    public IfcNonNegativeLengthMeasure MullionThickness;
    public IfcNormalisedRatioMeasure FirstTransomOffset;
    public IfcNormalisedRatioMeasure SecondTransomOffset;
    public IfcNormalisedRatioMeasure FirstMullionOffset;
    public IfcNormalisedRatioMeasure SecondMullionOffset;
    public IfcShapeAspect ShapeAspectStyle;
    public IfcLengthMeasure LiningOffset;
    public IfcLengthMeasure LiningToPanelOffsetX;
    public IfcLengthMeasure LiningToPanelOffsetY;

    // === WHERE CLAUSES ===
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    // WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset))
    // WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset))
    // WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
