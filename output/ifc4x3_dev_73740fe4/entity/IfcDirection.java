package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcDirection extends IfcGeometricRepresentationItem {

    // INVERSE attributes:
    // Dim : IfcDimensionCount := HIINDEX(DirectionRatios);
    // INVERSE attributes:
    // MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0;

    // WHERE constraints:
    // MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0;
}
