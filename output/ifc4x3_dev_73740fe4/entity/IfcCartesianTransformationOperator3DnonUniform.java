package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D {

    public IfcReal Scale2; // OPTIONAL
    public IfcReal Scale3; // OPTIONAL
    // INVERSE attributes:
    // Scl2 : IfcReal := NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl);
    // Scl3 : IfcReal := NVL(Scale3, SELF\IfcCartesianTransformationOperator.Scl);
    // INVERSE attributes:
    // Scale2GreaterZero : Scl2 > 0.0;
    // Scale3GreaterZero : Scl3 > 0.0;

    // WHERE constraints:
    // Scale2GreaterZero : Scl2 > 0.0;
    // Scale3GreaterZero : Scl3 > 0.0;
}
