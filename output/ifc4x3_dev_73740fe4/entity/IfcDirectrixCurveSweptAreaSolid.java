package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcDirectrixCurveSweptAreaSolid extends IfcSweptAreaSolid {

    public IfcCurve Directrix;
    public IfcCurveMeasureSelect StartParam; // OPTIONAL
    public IfcCurveMeasureSelect EndParam; // OPTIONAL
    // INVERSE attributes:
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR
    // (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1);

    // SUPERTYPE OF:
    // - IfcFixedReferenceSweptAreaSolid
    // - IfcSurfaceCurveSweptAreaSolid SUBTYPE OF IfcSweptAreaSolid

    // WHERE constraints:
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR
    // (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1);
}
