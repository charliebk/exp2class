public class IfcOpenCrossProfileDef : IfcProfileDef
{
    public IfcBoolean HorizontalWidths { get; set; }
    public List<IfcNonNegativeLengthMeasure> Widths { get; set; }
    public List<IfcPlaneAngleMeasure> Slopes { get; set; }
    public List<IfcLabel> Tags { get; set; }
    public IfcCartesianPoint OffsetPoint { get; set; }

    // === WHERE CLAUSES ===
    // CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE
    // CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths)
    // CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1))
}
