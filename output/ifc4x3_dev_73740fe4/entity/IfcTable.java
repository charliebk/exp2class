package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcTable {

    public IfcLabel Name; // OPTIONAL
    // INVERSE attributes:
    // NumberOfCellsInRow : IfcInteger := HIINDEX(Rows[1].RowCells);
    // NumberOfHeadings : IfcInteger := SIZEOF(QUERY( Temp <* Rows | Temp.IsHeading));
    // NumberOfDataRows : IfcInteger := SIZEOF(QUERY( Temp <* Rows | NOT(Temp.IsHeading)));
    // INVERSE attributes:
    // WR1 : SIZEOF(QUERY( Temp <* Rows | HIINDEX(Temp.RowCells) <> HIINDEX(Rows[1].RowCells))) = 0;
    // WR2 : { 0 <= NumberOfHeadings <= 1 };

    // WHERE constraints:
    // WR1 : SIZEOF(QUERY( Temp <* Rows | HIINDEX(Temp.RowCells) <> HIINDEX(Rows[1].RowCells))) = 0;
    // WR2 : { 0 <= NumberOfHeadings <= 1 };
}
