package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcRelConnectsPathElements extends IfcRelConnectsElements {

    public IfcConnectionTypeEnum RelatedConnectionType;
    public IfcConnectionTypeEnum RelatingConnectionType;
    // INVERSE attributes:
    // NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0)
    // OR
    // (SIZEOF (QUERY (temp <* RelatedPriorities
    // | {0 <= temp <= 100}
    // )) = SIZEOF(RelatedPriorities));
    // NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0)
    // OR
    // (SIZEOF (QUERY (temp <* RelatingPriorities
    // | {0 <= temp <= 100}
    // )) = SIZEOF(RelatingPriorities));

    // WHERE constraints:
    // NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0)
    // OR
    // (SIZEOF (QUERY (temp <* RelatedPriorities
    // | {0 <= temp <= 100}
    // )) = SIZEOF(RelatedPriorities));
    // NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0)
    // OR
    // (SIZEOF (QUERY (temp <* RelatingPriorities
    // | {0 <= temp <= 100}
    // )) = SIZEOF(RelatingPriorities));
}
