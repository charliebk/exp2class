package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcAdvancedBrepWithVoids extends IfcAdvancedBrep {

    // INVERSE attributes:
    // VoidsHaveAdvancedFaces : SIZEOF (QUERY (Vsh <* Voids |
    // SIZEOF (QUERY (Afs <* Vsh.CfsFaces |
    // (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs)))
    // )) = 0
    // )) = 0;

    // WHERE constraints:
    // VoidsHaveAdvancedFaces : SIZEOF (QUERY (Vsh <* Voids |
    // SIZEOF (QUERY (Afs <* Vsh.CfsFaces |
    // (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs)))
    // )) = 0
    // )) = 0;
}
