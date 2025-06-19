package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcLine extends IfcCurve {

    public IfcCartesianPoint Pnt;
    public IfcVector Dir;
    // INVERSE attributes:
    // SameDim : Dir.Dim = Pnt.Dim;

    // WHERE constraints:
    // SameDim : Dir.Dim = Pnt.Dim;
}
