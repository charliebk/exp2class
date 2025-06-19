package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid {

    public IfcDirection ExtrudedDirection;
    public IfcPositiveLengthMeasure Depth;
    // INVERSE attributes:
    // ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0;

    // SUPERTYPE OF:
    // - IfcExtrudedAreaSolidTapered SUBTYPE OF IfcSweptAreaSolid

    // WHERE constraints:
    // ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0;
}
