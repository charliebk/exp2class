public class IfcSweptSurface : IfcSurface
{
    public IfcProfileDef SweptCurve { get; set; }
    public IfcAxis2Placement3D Position { get; set; }

    // === EXTENDED BY ===
    // IfcSurfaceOfLinearExtrusion
    // IfcSurfaceOfRevolution

    // === WHERE CLAUSES ===
    // SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve
}
