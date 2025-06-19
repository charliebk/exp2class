package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcSweptSurface extends IfcSurface {

    public IfcProfileDef SweptCurve;
    public IfcAxis2Placement3D Position; // OPTIONAL
    // INVERSE attributes:
    // SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve;

    // SUPERTYPE OF:
    // - IfcSurfaceOfLinearExtrusion
    // - IfcSurfaceOfRevolution SUBTYPE OF IfcSurface

    // WHERE constraints:
    // SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve;
}
