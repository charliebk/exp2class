package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPointByDistanceExpression extends IfcPoint {

    public IfcCurveMeasureSelect DistanceAlong;
    public IfcLengthMeasure OffsetLateral; // OPTIONAL
    public IfcLengthMeasure OffsetVertical; // OPTIONAL
    public IfcLengthMeasure OffsetLongitudinal; // OPTIONAL
    public IfcCurve BasisCurve;
}
