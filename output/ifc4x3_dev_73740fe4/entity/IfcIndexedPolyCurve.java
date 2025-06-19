package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcIndexedPolyCurve extends IfcBoundedCurve {

    public IfcCartesianPointList Points;
    public IfcBoolean SelfIntersect; // OPTIONAL
    // INVERSE attributes:
    // Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments);

    // WHERE constraints:
    // Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments);
}
