package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcZone extends IfcSystem {

    public IfcLabel LongName; // OPTIONAL
    // INVERSE attributes:
    // WR1 : (SIZEOF(SELF\IfcGroup.IsGroupedBy) = 0) OR
    // (SIZEOF (QUERY (temp <* SELF\IfcGroup.IsGroupedBy[1].RelatedObjects |
    // NOT(('IFC4X3_DEV_73740fe4.IFCZONE' IN TYPEOF(temp)) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp)) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPATIALZONE' IN TYPEOF(temp))
    // ))) = 0);

    // WHERE constraints:
    // WR1 : (SIZEOF(SELF\IfcGroup.IsGroupedBy) = 0) OR
    // (SIZEOF (QUERY (temp <* SELF\IfcGroup.IsGroupedBy[1].RelatedObjects |
    // NOT(('IFC4X3_DEV_73740fe4.IFCZONE' IN TYPEOF(temp)) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp)) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPATIALZONE' IN TYPEOF(temp))
    // ))) = 0);
}
