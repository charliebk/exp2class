package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {

    public IfcLogical LayerOn;
    public IfcLogical LayerFrozen;
    public IfcLogical LayerBlocked;
    // INVERSE attributes:
    // ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems);

    // WHERE constraints:
    // ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems);
}
