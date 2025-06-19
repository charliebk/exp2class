package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCompositeCurveSegment extends IfcSegment {

    public IfcBoolean SameSense;
    public IfcCurve ParentCurve;
    // INVERSE attributes:
    // ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve));

    // SUPERTYPE OF:
    // - IfcReparametrisedCompositeCurveSegment SUBTYPE OF IfcSegment

    // WHERE constraints:
    // ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve));
}
