package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAlignmentHorizontalSegment extends IfcAlignmentParameterSegment {

    public IfcCartesianPoint StartPoint;
    public IfcPlaneAngleMeasure StartDirection;
    public IfcLengthMeasure StartRadiusOfCurvature;
    public IfcLengthMeasure EndRadiusOfCurvature;
    public IfcNonNegativeLengthMeasure SegmentLength;
    public IfcPositiveLengthMeasure GravityCenterLineHeight; // OPTIONAL
    public IfcAlignmentHorizontalSegmentTypeEnum PredefinedType;
}
