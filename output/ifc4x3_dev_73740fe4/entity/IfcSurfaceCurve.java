package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcSurfaceCurve extends IfcCurve {

    public IfcCurve Curve3D;
    public IfcPreferredSurfaceCurveRepresentation MasterRepresentation;
    // INVERSE attributes:
    // BasisSurface : SET [1:2] OF IfcSurface := IfcGetBasisSurface(SELF);
    // INVERSE attributes:
    // CurveIs3D : Curve3D.Dim = 3;
    // CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D));

    // SUPERTYPE OF:
    // - IfcIntersectionCurve
    // - IfcSeamCurve SUBTYPE OF IfcCurve

    // WHERE constraints:
    // CurveIs3D : Curve3D.Dim = 3;
    // CurveIsNotPcurve : NOT ('IFC4X3_DEV_73740fe4.IFCPCURVE' IN TYPEOF(Curve3D));
}
