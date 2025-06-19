package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcPropertyEnumeratedValue extends IfcSimpleProperty {

    public IfcPropertyEnumeration EnumerationReference; // OPTIONAL
    // INVERSE attributes:
    // WR21 : NOT(EXISTS(EnumerationReference))
    // OR  NOT(EXISTS(EnumerationValues))
    // OR  (SIZEOF(QUERY(temp <* EnumerationValues |
    // temp IN EnumerationReference.EnumerationValues))
    // = SIZEOF(EnumerationValues));

    // WHERE constraints:
    // WR21 : NOT(EXISTS(EnumerationReference))
    // OR  NOT(EXISTS(EnumerationValues))
    // OR  (SIZEOF(QUERY(temp <* EnumerationValues |
    // temp IN EnumerationReference.EnumerationValues))
    // = SIZEOF(EnumerationValues));
}
