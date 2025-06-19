package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcArbitraryOpenProfileDef extends IfcProfileDef {

    public IfcBoundedCurve Curve;
    // INVERSE attributes:
    // WR11 : ('IFC4X3_DEV_73740fe4.IFCCENTERLINEPROFILEDEF' IN TYPEOF(SELF)) OR
    // (SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE);
    // WR12 : Curve.Dim = 2;

    // SUPERTYPE OF:
    // - IfcCenterLineProfileDef SUBTYPE OF IfcProfileDef

    // WHERE constraints:
    // WR11 : ('IFC4X3_DEV_73740fe4.IFCCENTERLINEPROFILEDEF' IN TYPEOF(SELF)) OR
    // (SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE);
    // WR12 : Curve.Dim = 2;
}
