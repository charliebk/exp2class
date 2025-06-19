public class IfcArbitraryClosedProfileDef : IfcProfileDef
{
    public IfcCurve OuterCurve { get; set; }

    // === EXTENDED BY ===
    // IfcArbitraryProfileDefWithVoids

    // === WHERE CLAUSES ===
    // WR1 : OuterCurve.Dim = 2
    // WR2 : NOT('IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(OuterCurve))
    // WR3 : NOT('IFC4X3_DEV_73740fe4.IFCOFFSETCURVE2D' IN TYPEOF(OuterCurve))
}
