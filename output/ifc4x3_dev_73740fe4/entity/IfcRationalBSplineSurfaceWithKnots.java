package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcRationalBSplineSurfaceWithKnots extends IfcBSplineSurfaceWithKnots {

    // INVERSE attributes:
    // Weights : ARRAY [0:UUpper] OF ARRAY [0:VUpper] OF IfcReal := IfcMakeArrayOfArray(WeightsData,0,UUpper,0,VUpper);
    // INVERSE attributes:
    // CorrespondingWeightsDataLists : (SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineSurface.ControlPointsList))
    // AND
    // (SIZEOF(WeightsData[1]) = SIZEOF(SELF\IfcBSplineSurface.ControlPointsList[1]));
    // WeightValuesGreaterZero : IfcSurfaceWeightsPositive(SELF);

    // WHERE constraints:
    // CorrespondingWeightsDataLists : (SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineSurface.ControlPointsList))
    // AND
    // (SIZEOF(WeightsData[1]) = SIZEOF(SELF\IfcBSplineSurface.ControlPointsList[1]));
    // WeightValuesGreaterZero : IfcSurfaceWeightsPositive(SELF);
}
