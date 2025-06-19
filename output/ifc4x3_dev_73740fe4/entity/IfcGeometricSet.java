package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcGeometricSet extends IfcGeometricRepresentationItem {

    // INVERSE attributes:
    // Dim : IfcDimensionCount := Elements[1].Dim;
    // INVERSE attributes:
    // ConsistentDim : SIZEOF(QUERY(Temp <* Elements |
    // Temp.Dim <> Elements[1].Dim))
    // = 0;

    // SUPERTYPE OF:
    // - IfcGeometricCurveSet SUBTYPE OF IfcGeometricRepresentationItem

    // WHERE constraints:
    // ConsistentDim : SIZEOF(QUERY(Temp <* Elements |
    // Temp.Dim <> Elements[1].Dim))
    // = 0;
}
