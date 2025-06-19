class IfcPolyline extends IfcBoundedCurve {
    constructor() {
        /** @type {IFCCARTESIANPOINT[]} */
        this.Points = null;
    }

    // === WHERE CLAUSES ===
    // SameDim : SIZEOF(QUERY(Temp <* Points | Temp.Dim <> Points[1].Dim)) = 0
}
