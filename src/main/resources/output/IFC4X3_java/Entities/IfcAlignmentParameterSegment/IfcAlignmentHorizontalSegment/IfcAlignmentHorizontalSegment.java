public class IfcAlignmentHorizontalSegment extends IfcAlignmentParameterSegment {
    public IfcCartesianPoint StartPoint;
    public IfcPlaneAngleMeasure StartDirection;
    public IfcLengthMeasure StartRadiusOfCurvature;
    public IfcLengthMeasure EndRadiusOfCurvature;
    public IfcNonNegativeLengthMeasure SegmentLength;
    public IfcPositiveLengthMeasure GravityCenterLineHeight;
    public IfcAlignmentHorizontalSegmentTypeEnum PredefinedType;
}
