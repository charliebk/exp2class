public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem {
    public IfcCurveStyle HatchLineAppearance;
    public IfcHatchLineDistanceSelect StartOfNextHatchLine;
    public IfcCartesianPoint PointOfReferenceHatchLine;
    public IfcCartesianPoint PatternStart;
    public IfcPlaneAngleMeasure HatchLineAngle;

    // === WHERE CLAUSES ===
    // PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    // RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2)
}
