package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcPresentationLayerAssignment {

    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    public IfcIdentifier Identifier; // OPTIONAL
    // INVERSE attributes:
    // ApplicableItems : SIZEOF(QUERY(temp <* AssignedItems | (
    // SIZEOF(TYPEOF(temp) * [
    // 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION',
    // 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONITEM',
    // 'IFC4X3_DEV_73740fe4.IFCMAPPEDITEM']) = 1)
    // )) = SIZEOF(AssignedItems);

    // SUPERTYPE OF:
    // - IfcPresentationLayerWithStyle

    // WHERE constraints:
    // ApplicableItems : SIZEOF(QUERY(temp <* AssignedItems | (
    // SIZEOF(TYPEOF(temp) * [
    // 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION',
    // 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONITEM',
    // 'IFC4X3_DEV_73740fe4.IFCMAPPEDITEM']) = 1)
    // )) = SIZEOF(AssignedItems);
}
