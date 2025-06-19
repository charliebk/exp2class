public class IfcFillAreaStyleHatching : IfcGeometricRepresentationItem
{
    public IfcCurveStyle HatchLineAppearance { get; set; }
    public IfcHatchLineDistanceSelect StartOfNextHatchLine { get; set; }
    public IfcCartesianPoint PointOfReferenceHatchLine { get; set; }
    public IfcCartesianPoint PatternStart { get; set; }
    public IfcPlaneAngleMeasure HatchLineAngle { get; set; }

    // === WHERE CLAUSES ===
    // PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    // RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2)
}
