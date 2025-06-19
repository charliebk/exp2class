package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcShapeModel extends IfcRepresentation {

    // INVERSE attributes:
    // OfShapeAspect : SET [0:1] OF IfcShapeAspect FOR ShapeRepresentations;
    // INVERSE attributes:
    // WR11 : (SIZEOF(SELF\IfcRepresentation.OfProductRepresentation) = 1) XOR
    // (SIZEOF(SELF\IfcRepresentation.RepresentationMap) = 1) XOR
    // (SIZEOF(OfShapeAspect) = 1);

    // SUPERTYPE OF:
    // - IfcShapeRepresentation
    // - IfcTopologyRepresentation SUBTYPE OF IfcRepresentation

    // WHERE constraints:
    // WR11 : (SIZEOF(SELF\IfcRepresentation.OfProductRepresentation) = 1) XOR
    // (SIZEOF(SELF\IfcRepresentation.RepresentationMap) = 1) XOR
    // (SIZEOF(OfShapeAspect) = 1);
}
