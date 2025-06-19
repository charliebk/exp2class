package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcRelDeclares extends IfcRelationship {

    public IfcContext RelatingContext;
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0;

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0;
}
