package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSweptDiskSolid extends IfcSolidModel {

    public IfcCurve Directrix;
    public IfcPositiveLengthMeasure Radius;
    public IfcPositiveLengthMeasure InnerRadius; // OPTIONAL
    public IfcParameterValue StartParam; // OPTIONAL
    public IfcParameterValue EndParam; // OPTIONAL
    // INVERSE attributes:
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR
    // (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1);
    // DirectrixDim : Directrix.Dim = 3;
    // InnerRadiusSize : (NOT EXISTS(InnerRadius)) OR (Radius > InnerRadius);

    // SUPERTYPE OF:
    // - IfcSweptDiskSolidPolygonal SUBTYPE OF IfcSolidModel

    // WHERE constraints:
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR
    // (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1);
    // DirectrixDim : Directrix.Dim = 3;
    // InnerRadiusSize : (NOT EXISTS(InnerRadius)) OR (Radius > InnerRadius);
}
