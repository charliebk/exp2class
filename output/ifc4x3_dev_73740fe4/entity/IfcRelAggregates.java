package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcRelAggregates extends IfcRelDecomposes {

    public IfcObjectDefinition RelatingObject;
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0;

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0;
}
