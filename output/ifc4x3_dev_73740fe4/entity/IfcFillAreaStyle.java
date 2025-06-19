package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcFillAreaStyle extends IfcPresentationStyle {

    public IfcBoolean ModelOrDraughting; // OPTIONAL
    // INVERSE attributes:
    // ConsistentHatchStyleDef : IfcCorrectFillAreaStyle(SELF.FillStyles);
    // MaxOneColour : SIZEOF(QUERY(Style <* SELF.FillStyles |
    // 'IFC4X3_DEV_73740fe4.IFCCOLOUR' IN
    // TYPEOF(Style)
    // )) <= 1;
    // MaxOneExtHatchStyle : SIZEOF(QUERY(Style <* SELF.FillStyles |
    // 'IFC4X3_DEV_73740fe4.IFCEXTERNALLYDEFINEDHATCHSTYLE' IN
    // TYPEOF(Style)
    // )) <= 1;

    // WHERE constraints:
    // ConsistentHatchStyleDef : IfcCorrectFillAreaStyle(SELF.FillStyles);
    // MaxOneColour : SIZEOF(QUERY(Style <* SELF.FillStyles |
    // 'IFC4X3_DEV_73740fe4.IFCCOLOUR' IN
    // TYPEOF(Style)
    // )) <= 1;
    // MaxOneExtHatchStyle : SIZEOF(QUERY(Style <* SELF.FillStyles |
    // 'IFC4X3_DEV_73740fe4.IFCEXTERNALLYDEFINEDHATCHSTYLE' IN
    // TYPEOF(Style)
    // )) <= 1;
}
