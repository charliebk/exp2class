package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAxis2PlacementLinear extends IfcPlacement {

    public IfcDirection Axis; // OPTIONAL
    public IfcDirection RefDirection; // OPTIONAL
    // INVERSE attributes:
    // WR1 : 'IFC4X3_DEV_73740fe4.IFCPOINTBYDISTANCEEXPRESSION' IN TYPEOF(SELF\IfcPlacement.Location);
    // WR2 : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0);

    // WHERE constraints:
    // WR1 : 'IFC4X3_DEV_73740fe4.IFCPOINTBYDISTANCEEXPRESSION' IN TYPEOF(SELF\IfcPlacement.Location);
    // WR2 : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0);
}
