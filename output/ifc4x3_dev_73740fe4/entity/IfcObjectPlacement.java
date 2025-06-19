package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcObjectPlacement {

    public IfcObjectPlacement PlacementRelTo; // OPTIONAL
    // INVERSE attributes:
    // PlacesObject : SET [0:?] OF IfcProduct FOR ObjectPlacement;
    // ReferencedByPlacements : SET [0:?] OF IfcObjectPlacement FOR PlacementRelTo;

    // SUPERTYPE OF:
    // - IfcGridPlacement
    // - IfcLinearPlacement
    // - IfcLocalPlacement
}
