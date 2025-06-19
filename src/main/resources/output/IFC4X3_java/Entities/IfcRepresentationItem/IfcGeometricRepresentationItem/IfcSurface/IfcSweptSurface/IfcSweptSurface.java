public class IfcSweptSurface extends IfcSurface {
    public IfcProfileDef SweptCurve;
    public IfcAxis2Placement3D Position;

    // === EXTENDED BY ===
    // IfcSurfaceOfLinearExtrusion
    // IfcSurfaceOfRevolution

    // === WHERE CLAUSES ===
    // SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve
}
