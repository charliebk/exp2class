from typing import List

class IfcTable:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Rows: List[IfcTableRow] = None
        self.Columns: List[IfcTableColumn] = None

    # === WHERE CLAUSES ===
    # WR1 : SIZEOF(QUERY( Temp <* Rows | HIINDEX(Temp.RowCells) <> HIINDEX(Rows[1].RowCells))) = 0
    # WR2 : { 0 <= NumberOfHeadings <= 1 }

    # === DERIVE CLAUSES ===
    # NumberOfCellsInRow : IfcInteger := HIINDEX(Rows[1].RowCells)
    # NumberOfHeadings : IfcInteger := SIZEOF(QUERY( Temp <* Rows | Temp.IsHeading))
    # NumberOfDataRows : IfcInteger := SIZEOF(QUERY( Temp <* Rows | NOT(Temp.IsHeading)))
