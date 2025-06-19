public class IfcOpenCrossProfileDef extends IfcProfileDef {
    public IfcBoolean HorizontalWidths;
    public List<IfcNonNegativeLengthMeasure> Widths;
    public List<IfcPlaneAngleMeasure> Slopes;
    public List<IfcLabel> Tags;
    public IfcCartesianPoint OffsetPoint;

    // === WHERE CLAUSES ===
    // CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE
    // CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths)
    // CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1))
}
