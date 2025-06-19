package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelAssignsToGroup extends IfcRelAssigns {

    public IfcGroup RelatingGroup;
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0;

    // SUPERTYPE OF:
    // - IfcRelAssignsToGroupByFactor SUBTYPE OF IfcRelAssigns

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0;
}
