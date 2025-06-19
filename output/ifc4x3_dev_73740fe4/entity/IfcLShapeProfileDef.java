package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcLShapeProfileDef extends IfcParameterizedProfileDef {

    public IfcPositiveLengthMeasure Depth;
    public IfcPositiveLengthMeasure Width; // OPTIONAL
    public IfcPositiveLengthMeasure Thickness;
    public IfcNonNegativeLengthMeasure FilletRadius; // OPTIONAL
    public IfcNonNegativeLengthMeasure EdgeRadius; // OPTIONAL
    public IfcPlaneAngleMeasure LegSlope; // OPTIONAL
    // INVERSE attributes:
    // ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width));

    // WHERE constraints:
    // ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width));
}
