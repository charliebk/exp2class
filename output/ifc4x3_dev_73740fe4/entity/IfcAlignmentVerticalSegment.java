package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAlignmentVerticalSegment extends IfcAlignmentParameterSegment {

    public IfcLengthMeasure StartDistAlong;
    public IfcNonNegativeLengthMeasure HorizontalLength;
    public IfcLengthMeasure StartHeight;
    public IfcRatioMeasure StartGradient;
    public IfcRatioMeasure EndGradient;
    public IfcLengthMeasure RadiusOfCurvature; // OPTIONAL
    public IfcAlignmentVerticalSegmentTypeEnum PredefinedType;
}
