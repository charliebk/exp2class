package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcSpatialStructureElement extends IfcSpatialElement {

    public IfcElementCompositionEnum CompositionType; // OPTIONAL
    // INVERSE attributes:
    // WR41 : (HIINDEX(SELF\IfcObjectDefinition.Decomposes) = 1)
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCRELAGGREGATES' IN TYPEOF(SELF\IfcObjectDefinition.Decomposes[1]))
    // AND
    // (('IFC4X3_DEV_73740fe4.IFCPROJECT' IN TYPEOF (SELF\IfcObjectDefinition.Decomposes[1].RelatingObject)) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF (SELF\IfcObjectDefinition.Decomposes[1].RelatingObject))
    // );

    // SUPERTYPE OF:
    // - IfcBuildingStorey
    // - IfcFacility
    // - IfcFacilityPart
    // - IfcSite
    // - IfcSpace SUBTYPE OF IfcSpatialElement

    // WHERE constraints:
    // WR41 : (HIINDEX(SELF\IfcObjectDefinition.Decomposes) = 1)
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCRELAGGREGATES' IN TYPEOF(SELF\IfcObjectDefinition.Decomposes[1]))
    // AND
    // (('IFC4X3_DEV_73740fe4.IFCPROJECT' IN TYPEOF (SELF\IfcObjectDefinition.Decomposes[1].RelatingObject)) OR
    // ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF (SELF\IfcObjectDefinition.Decomposes[1].RelatingObject))
    // );
}
