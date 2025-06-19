package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCartesianTransformationOperator2DnonUniform extends IfcCartesianTransformationOperator2D {

    public IfcReal Scale2; // OPTIONAL
    // INVERSE attributes:
    // Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl);
    // INVERSE attributes:
    // Scale2GreaterZero : Scl2 > 0.0;

    // WHERE constraints:
    // Scale2GreaterZero : Scl2 > 0.0;
}
