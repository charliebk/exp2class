public class IfcArbitraryProfileDefWithVoids : IfcArbitraryClosedProfileDef
{
    public SET [1:?] OF IfcCurve InnerCurves { get; set; }

    // === WHERE CLAUSES ===
    // WR1 : SELF\IfcProfileDef.ProfileType = AREA
    // WR2 : SIZEOF(QUERY(temp <* InnerCurves | temp.Dim <> 2)) = 0
    // WR3 : SIZEOF(QUERY(temp <* InnerCurves | 'IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(temp))) = 0
}
