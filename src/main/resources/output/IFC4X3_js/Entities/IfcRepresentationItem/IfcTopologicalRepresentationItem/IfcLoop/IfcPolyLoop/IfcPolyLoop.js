class IfcPolyLoop extends IfcLoop {
    constructor() {
        /** @type {UNIQUE IFCCARTESIANPOINT[]} */
        this.Polygon = null;
    }

    // === WHERE CLAUSES ===
    // AllPointsSameDim : SIZEOF(QUERY(Temp <* Polygon | Temp.Dim <> Polygon[1].Dim)) = 0
}
