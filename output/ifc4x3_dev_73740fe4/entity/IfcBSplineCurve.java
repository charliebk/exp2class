package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public abstract class IfcBSplineCurve extends IfcBoundedCurve {

    public IfcInteger Degree;
    public IfcBSplineCurveForm CurveForm;
    public IfcLogical ClosedCurve;
    public IfcLogical SelfIntersect;
    // INVERSE attributes:
    // UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1);
    // ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints);
    // INVERSE attributes:
    // SameDim : SIZEOF(QUERY(Temp <* ControlPointsList |
    // Temp.Dim <> ControlPointsList[1].Dim))
    // = 0;

    // SUPERTYPE OF:
    // - IfcBSplineCurveWithKnots SUBTYPE OF IfcBoundedCurve

    // WHERE constraints:
    // SameDim : SIZEOF(QUERY(Temp <* ControlPointsList |
    // Temp.Dim <> ControlPointsList[1].Dim))
    // = 0;
}
