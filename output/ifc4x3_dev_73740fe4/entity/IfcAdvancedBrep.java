package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAdvancedBrep extends IfcManifoldSolidBrep {

    // INVERSE attributes:
    // HasAdvancedFaces : SIZEOF(QUERY(Afs <* SELF\IfcManifoldSolidBrep.Outer.CfsFaces |
    // (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs)))
    // )) = 0;

    // SUPERTYPE OF:
    // - IfcAdvancedBrepWithVoids SUBTYPE OF IfcManifoldSolidBrep

    // WHERE constraints:
    // HasAdvancedFaces : SIZEOF(QUERY(Afs <* SELF\IfcManifoldSolidBrep.Outer.CfsFaces |
    // (NOT ('IFC4X3_DEV_73740fe4.IFCADVANCEDFACE' IN TYPEOF(Afs)))
    // )) = 0;
}
