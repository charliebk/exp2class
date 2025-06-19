package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelAssignsToControl extends IfcRelAssigns {

    public IfcControl RelatingControl;
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0;

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0;
}
