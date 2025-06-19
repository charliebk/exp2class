package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem {

    public IfcCurveStyle HatchLineAppearance;
    public IfcHatchLineDistanceSelect StartOfNextHatchLine;
    public IfcCartesianPoint PointOfReferenceHatchLine; // OPTIONAL
    public IfcCartesianPoint PatternStart; // OPTIONAL
    public IfcPlaneAngleMeasure HatchLineAngle;
    // INVERSE attributes:
    // PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    // ;
    // RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2);

    // WHERE constraints:
    // PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    // ;
    // RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2);
}
