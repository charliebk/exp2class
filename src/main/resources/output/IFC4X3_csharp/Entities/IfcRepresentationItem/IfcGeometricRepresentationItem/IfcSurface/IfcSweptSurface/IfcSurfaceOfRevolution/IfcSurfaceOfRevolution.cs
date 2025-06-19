public class IfcSurfaceOfRevolution : IfcSweptSurface
{
    public IfcAxis1Placement AxisPosition { get; set; }

    // === DERIVE CLAUSES ===
    // AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(AxisPosition.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(AxisPosition.Z,1.0))
}
