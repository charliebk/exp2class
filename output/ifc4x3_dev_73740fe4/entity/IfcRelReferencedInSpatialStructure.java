package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcRelReferencedInSpatialStructure extends IfcRelConnects {

    public IfcSpatialElement RelatingStructure;
    // INVERSE attributes:
    // AllowedRelatedElements : SIZEOF(QUERY(temp <* RelatedElements | ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp)))
    // )) = 0;

    // WHERE constraints:
    // AllowedRelatedElements : SIZEOF(QUERY(temp <* RelatedElements | ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp)))
    // )) = 0;
}
