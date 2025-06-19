package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public abstract class IfcPropertyEnumeration extends IfcPropertyAbstraction {

    public IfcLabel Name;
    public IfcUnit Unit; // OPTIONAL
    // INVERSE attributes:
    // UR1 : Name;
    // INVERSE attributes:
    // WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues |
    // NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp))
    // )) = 0;

    // WHERE constraints:
    // WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues |
    // NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp))
    // )) = 0;
}
