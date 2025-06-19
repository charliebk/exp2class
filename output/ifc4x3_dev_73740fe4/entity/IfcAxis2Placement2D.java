package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcAxis2Placement2D extends IfcPlacement {

    public IfcDirection RefDirection; // OPTIONAL
    // INVERSE attributes:
    // P : LIST [2:2] OF IfcDirection := IfcBuild2Axes(RefDirection);
    // INVERSE attributes:
    // LocationIs2D : SELF\IfcPlacement.Location.Dim = 2;
    // LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location);
    // RefDirIs2D : (NOT (EXISTS (RefDirection))) OR (RefDirection.Dim = 2);

    // WHERE constraints:
    // LocationIs2D : SELF\IfcPlacement.Location.Dim = 2;
    // LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location);
    // RefDirIs2D : (NOT (EXISTS (RefDirection))) OR (RefDirection.Dim = 2);
}
