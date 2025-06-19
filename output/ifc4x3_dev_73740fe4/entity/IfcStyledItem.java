package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcStyledItem extends IfcRepresentationItem {

    public IfcRepresentationItem Item; // OPTIONAL
    public IfcLabel Name; // OPTIONAL
    // INVERSE attributes:
    // ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item));

    // WHERE constraints:
    // ApplicableItem : NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(Item));
}
