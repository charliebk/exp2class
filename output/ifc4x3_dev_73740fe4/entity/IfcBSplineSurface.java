package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public abstract class IfcBSplineSurface extends IfcBoundedSurface {

    public IfcInteger UDegree;
    public IfcInteger VDegree;
    public IfcBSplineSurfaceForm SurfaceForm;
    public IfcLogical UClosed;
    public IfcLogical VClosed;
    public IfcLogical SelfIntersect;
    // INVERSE attributes:
    // UUpper : IfcInteger := SIZEOF(ControlPointsList) - 1;
    // VUpper : IfcInteger := SIZEOF(ControlPointsList[1]) - 1;
    // ControlPoints : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcCartesianPoint := IfcMakeArrayOfArray(ControlPointsList,
    // 0,UUpper,0,VUpper);

    // SUPERTYPE OF:
    // - IfcBSplineSurfaceWithKnots SUBTYPE OF IfcBoundedSurface
}
