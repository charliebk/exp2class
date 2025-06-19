package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAlignmentCantSegment extends IfcAlignmentParameterSegment {

    public IfcLengthMeasure StartDistAlong;
    public IfcNonNegativeLengthMeasure HorizontalLength;
    public IfcLengthMeasure StartCantLeft;
    public IfcLengthMeasure EndCantLeft; // OPTIONAL
    public IfcLengthMeasure StartCantRight;
    public IfcLengthMeasure EndCantRight; // OPTIONAL
    public IfcAlignmentCantSegmentTypeEnum PredefinedType;
}
