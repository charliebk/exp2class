package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelAssignsToActor extends IfcRelAssigns {

    public IfcActor RelatingActor;
    public IfcActorRole ActingRole; // OPTIONAL
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0;

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0;
}
