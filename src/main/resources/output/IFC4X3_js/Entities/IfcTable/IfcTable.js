class IfcTable {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTABLEROW[]} */
        this.Rows = null;
        /** @type {IFCTABLECOLUMN[]} */
        this.Columns = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : SIZEOF(QUERY( Temp <* Rows | HIINDEX(Temp.RowCells) <> HIINDEX(Rows[1].RowCells))) = 0
    // WR2 : { 0 <= NumberOfHeadings <= 1 }

    // === DERIVE CLAUSES ===
    // NumberOfCellsInRow : IfcInteger := HIINDEX(Rows[1].RowCells)
    // NumberOfHeadings : IfcInteger := SIZEOF(QUERY( Temp <* Rows | Temp.IsHeading))
    // NumberOfDataRows : IfcInteger := SIZEOF(QUERY( Temp <* Rows | NOT(Temp.IsHeading)))
}
