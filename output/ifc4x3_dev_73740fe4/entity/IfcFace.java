package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcFace extends IfcTopologicalRepresentationItem {

    // INVERSE attributes:
    // HasTextureMaps : SET [0:?] OF IfcTextureMap FOR MappedTo;
    // INVERSE attributes:
    // HasOuterBound : SIZEOF(QUERY(temp <* Bounds | 'IFC4X3_DEV_73740fe4.IFCFACEOUTERBOUND' IN TYPEOF(temp))) <= 1;

    // SUPERTYPE OF:
    // - IfcFaceSurface SUBTYPE OF IfcTopologicalRepresentationItem

    // WHERE constraints:
    // HasOuterBound : SIZEOF(QUERY(temp <* Bounds | 'IFC4X3_DEV_73740fe4.IFCFACEOUTERBOUND' IN TYPEOF(temp))) <= 1;
}
