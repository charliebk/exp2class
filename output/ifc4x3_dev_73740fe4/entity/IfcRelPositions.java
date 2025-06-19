package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcRelPositions extends IfcRelConnects {

    public IfcPositioningElement RelatingPositioningElement;
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0;

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0;
}
