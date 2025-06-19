public class IfcArbitraryOpenProfileDef extends IfcProfileDef {
    public IfcBoundedCurve Curve;

    // === EXTENDED BY ===
    // IfcCenterLineProfileDef

    // === WHERE CLAUSES ===
    // WR11 : ('IFC4X3_DEV_73740fe4.IFCCENTERLINEPROFILEDEF' IN TYPEOF(SELF)) OR (SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE)
    // WR12 : Curve.Dim = 2
}
