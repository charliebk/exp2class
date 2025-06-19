Public Class IfcTable
    Public Name As IfcLabel
    Public Rows As List(Of IfcTableRow)
    Public Columns As List(Of IfcTableColumn)

    ' === WHERE CLAUSES ===
    ' WR1 : SIZEOF(QUERY( Temp <* Rows | HIINDEX(Temp.RowCells) <> HIINDEX(Rows[1].RowCells))) = 0
    ' WR2 : { 0 <= NumberOfHeadings <= 1 }

    ' === DERIVE CLAUSES ===
    ' NumberOfCellsInRow : IfcInteger := HIINDEX(Rows[1].RowCells)
    ' NumberOfHeadings : IfcInteger := SIZEOF(QUERY( Temp <* Rows | Temp.IsHeading))
    ' NumberOfDataRows : IfcInteger := SIZEOF(QUERY( Temp <* Rows | NOT(Temp.IsHeading)))
End Class
