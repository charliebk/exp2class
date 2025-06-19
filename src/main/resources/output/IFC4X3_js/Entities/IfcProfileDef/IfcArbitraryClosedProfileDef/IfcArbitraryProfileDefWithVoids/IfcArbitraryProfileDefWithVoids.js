class IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef {
    constructor() {
        /** @type {SET [1:?] OF IFCCURVE} */
        this.InnerCurves = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : SELF\IfcProfileDef.ProfileType = AREA
    // WR2 : SIZEOF(QUERY(temp <* InnerCurves | temp.Dim <> 2)) = 0
    // WR3 : SIZEOF(QUERY(temp <* InnerCurves | 'IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(temp))) = 0
}
