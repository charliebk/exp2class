package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {

    public IfcDirection Axis1; // OPTIONAL
    public IfcDirection Axis2; // OPTIONAL
    public IfcCartesianPoint LocalOrigin;
    public IfcReal Scale; // OPTIONAL
    // INVERSE attributes:
    // Scl : IfcReal := NVL(Scale, 1.0);
    // Dim : IfcDimensionCount := LocalOrigin.Dim;
    // INVERSE attributes:
    // ScaleGreaterZero : Scl > 0.0;

    // SUPERTYPE OF:
    // - IfcCartesianTransformationOperator2D
    // - IfcCartesianTransformationOperator3D SUBTYPE OF IfcGeometricRepresentationItem

    // WHERE constraints:
    // ScaleGreaterZero : Scl > 0.0;
}
