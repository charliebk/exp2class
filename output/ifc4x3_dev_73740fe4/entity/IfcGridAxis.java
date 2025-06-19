package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcGridAxis {

    public IfcLabel AxisTag; // OPTIONAL
    public IfcCurve AxisCurve;
    public IfcBoolean SameSense;
    // INVERSE attributes:
    // PartOfW : SET [0:1] OF IfcGrid FOR WAxes;
    // PartOfV : SET [0:1] OF IfcGrid FOR VAxes;
    // PartOfU : SET [0:1] OF IfcGrid FOR UAxes;
    // HasIntersections : SET [0:?] OF IfcVirtualGridIntersection FOR IntersectingAxes;
    // INVERSE attributes:
    // WR1 : AxisCurve.Dim = 2;
    // WR2 : (SIZEOF(PartOfU) = 1) XOR (SIZEOF(PartOfV) = 1) XOR (SIZEOF(PartOfW) = 1);

    // WHERE constraints:
    // WR1 : AxisCurve.Dim = 2;
    // WR2 : (SIZEOF(PartOfU) = 1) XOR (SIZEOF(PartOfV) = 1) XOR (SIZEOF(PartOfW) = 1);
}
