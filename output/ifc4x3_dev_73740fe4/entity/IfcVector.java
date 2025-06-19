package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVector extends IfcGeometricRepresentationItem {

    public IfcDirection Orientation;
    public IfcLengthMeasure Magnitude;
    // INVERSE attributes:
    // Dim : IfcDimensionCount := Orientation.Dim;
    // INVERSE attributes:
    // MagGreaterOrEqualZero : Magnitude >= 0.0;

    // WHERE constraints:
    // MagGreaterOrEqualZero : Magnitude >= 0.0;
}
