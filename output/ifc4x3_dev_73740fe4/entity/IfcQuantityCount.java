package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcQuantityCount extends IfcPhysicalSimpleQuantity {

    public IfcCountMeasure CountValue;
    public IfcLabel Formula; // OPTIONAL
    // INVERSE attributes:
    // WR21 : CountValue >= 0;

    // WHERE constraints:
    // WR21 : CountValue >= 0;
}
