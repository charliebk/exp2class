package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef {

    // INVERSE attributes:
    // WR1 : SELF\IfcProfileDef.ProfileType = AREA;
    // WR2 : SIZEOF(QUERY(temp <* InnerCurves | temp.Dim <> 2)) = 0;
    // WR3 : SIZEOF(QUERY(temp <* InnerCurves | 'IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(temp))) = 0;

    // WHERE constraints:
    // WR1 : SELF\IfcProfileDef.ProfileType = AREA;
    // WR2 : SIZEOF(QUERY(temp <* InnerCurves | temp.Dim <> 2)) = 0;
    // WR3 : SIZEOF(QUERY(temp <* InnerCurves | 'IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(temp))) = 0;
}
