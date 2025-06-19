package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcPositioningElement extends IfcProduct {

    // INVERSE attributes:
    // ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements;
    // Positions : SET [0:?] OF IfcRelPositions FOR RelatingPositioningElement;
    // INVERSE attributes:
    // HasPlacement : EXISTS(SELF\IfcProduct.ObjectPlacement);

    // SUPERTYPE OF:
    // - IfcGrid
    // - IfcLinearPositioningElement
    // - IfcReferent SUBTYPE OF IfcProduct

    // WHERE constraints:
    // HasPlacement : EXISTS(SELF\IfcProduct.ObjectPlacement);
}
