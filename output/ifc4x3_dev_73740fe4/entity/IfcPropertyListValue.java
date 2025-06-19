package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcPropertyListValue extends IfcSimpleProperty {

    public IfcUnit Unit; // OPTIONAL
    // INVERSE attributes:
    // WR31 : SIZEOF(QUERY(temp <* SELF.ListValues |
    // NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp))
    // )) = 0;

    // WHERE constraints:
    // WR31 : SIZEOF(QUERY(temp <* SELF.ListValues |
    // NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp))
    // )) = 0;
}
