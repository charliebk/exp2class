public class IfcSurfaceOfRevolution extends IfcSweptSurface {
    public IfcAxis1Placement AxisPosition;

    // === DERIVE CLAUSES ===
    // AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(AxisPosition.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(AxisPosition.Z,1.0))
}
