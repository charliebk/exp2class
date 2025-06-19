package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcAxis2Placement3D extends IfcPlacement {

    public IfcDirection Axis; // OPTIONAL
    public IfcDirection RefDirection; // OPTIONAL
    // INVERSE attributes:
    // P : LIST [3:3] OF IfcDirection := IfcBuildAxes(Axis, RefDirection);
    // INVERSE attributes:
    // AxisAndRefDirProvision : NOT ((EXISTS (Axis)) XOR (EXISTS (RefDirection)));
    // AxisIs3D : (NOT (EXISTS (Axis))) OR (Axis.Dim = 3);
    // AxisToRefDirPosition : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0);
    // LocationIs3D : SELF\IfcPlacement.Location.Dim = 3;
    // LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location);
    // RefDirIs3D : (NOT (EXISTS (RefDirection))) OR (RefDirection.Dim = 3);

    // WHERE constraints:
    // AxisAndRefDirProvision : NOT ((EXISTS (Axis)) XOR (EXISTS (RefDirection)));
    // AxisIs3D : (NOT (EXISTS (Axis))) OR (Axis.Dim = 3);
    // AxisToRefDirPosition : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0);
    // LocationIs3D : SELF\IfcPlacement.Location.Dim = 3;
    // LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location);
    // RefDirIs3D : (NOT (EXISTS (RefDirection))) OR (RefDirection.Dim = 3);
}
