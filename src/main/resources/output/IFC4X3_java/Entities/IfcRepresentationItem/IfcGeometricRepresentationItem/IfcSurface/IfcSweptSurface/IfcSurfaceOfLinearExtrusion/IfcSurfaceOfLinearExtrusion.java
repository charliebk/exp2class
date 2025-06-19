public class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface {
    public IfcDirection ExtrudedDirection;
    public IfcLengthMeasure Depth;

    // === WHERE CLAUSES ===
    // DepthGreaterZero : Depth > 0.

    // === DERIVE CLAUSES ===
    // ExtrusionAxis : IfcVector := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector (ExtrudedDirection, Depth)
}
