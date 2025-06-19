package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcArbitraryClosedProfileDef extends IfcProfileDef {

    public IfcCurve OuterCurve;
    // INVERSE attributes:
    // WR1 : OuterCurve.Dim = 2;
    // WR2 : NOT('IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(OuterCurve));
    // WR3 : NOT('IFC4X3_DEV_73740fe4.IFCOFFSETCURVE2D' IN TYPEOF(OuterCurve));

    // SUPERTYPE OF:
    // - IfcArbitraryProfileDefWithVoids SUBTYPE OF IfcProfileDef

    // WHERE constraints:
    // WR1 : OuterCurve.Dim = 2;
    // WR2 : NOT('IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(OuterCurve));
    // WR3 : NOT('IFC4X3_DEV_73740fe4.IFCOFFSETCURVE2D' IN TYPEOF(OuterCurve));
}
