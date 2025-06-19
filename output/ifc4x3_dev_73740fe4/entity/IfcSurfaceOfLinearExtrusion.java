package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface {

    public IfcDirection ExtrudedDirection;
    public IfcLengthMeasure Depth;
    // INVERSE attributes:
    // ExtrusionAxis : IfcVector := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector (ExtrudedDirection, Depth);
    // INVERSE attributes:
    // DepthGreaterZero : Depth > 0.;

    // WHERE constraints:
    // DepthGreaterZero : Depth > 0.;
}
