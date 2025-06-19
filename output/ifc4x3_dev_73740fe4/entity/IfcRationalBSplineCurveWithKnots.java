package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcRationalBSplineCurveWithKnots extends IfcBSplineCurveWithKnots {

    // INVERSE attributes:
    // Weights : ARRAY [0:UpperIndexOnControlPoints] OF IfcReal := IfcListToArray(WeightsData,0,SELF\IfcBSplineCurve.UpperIndexOnControlPoints);
    // INVERSE attributes:
    // SameNumOfWeightsAndPoints : SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineCurve.ControlPointsList);
    // WeightsGreaterZero : IfcCurveWeightsPositive(SELF);

    // WHERE constraints:
    // SameNumOfWeightsAndPoints : SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineCurve.ControlPointsList);
    // WeightsGreaterZero : IfcCurveWeightsPositive(SELF);
}
