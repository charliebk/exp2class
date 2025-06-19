public class IfcSurfaceOfLinearExtrusion : IfcSweptSurface
{
    public IfcDirection ExtrudedDirection { get; set; }
    public IfcLengthMeasure Depth { get; set; }

    // === WHERE CLAUSES ===
    // DepthGreaterZero : Depth > 0.

    // === DERIVE CLAUSES ===
    // ExtrusionAxis : IfcVector := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector (ExtrudedDirection, Depth)
}
