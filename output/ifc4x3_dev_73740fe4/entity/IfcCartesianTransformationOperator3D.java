package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator {

    public IfcDirection Axis3; // OPTIONAL
    // INVERSE attributes:
    // U : LIST [3:3] OF IfcDirection := IfcBaseAxis(3,SELF\IfcCartesianTransformationOperator.Axis1,
    // SELF\IfcCartesianTransformationOperator.Axis2,Axis3);
    // INVERSE attributes:
    // Axis1Is3D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis1)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis1.Dim = 3);
    // Axis2Is3D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis2)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis2.Dim = 3);
    // Axis3Is3D : NOT(EXISTS(Axis3)) OR (Axis3.Dim = 3);
    // DimIs3D : SELF\IfcCartesianTransformationOperator.Dim = 3;

    // SUPERTYPE OF:
    // - IfcCartesianTransformationOperator3DnonUniform SUBTYPE OF IfcCartesianTransformationOperator

    // WHERE constraints:
    // Axis1Is3D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis1)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis1.Dim = 3);
    // Axis2Is3D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis2)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis2.Dim = 3);
    // Axis3Is3D : NOT(EXISTS(Axis3)) OR (Axis3.Dim = 3);
    // DimIs3D : SELF\IfcCartesianTransformationOperator.Dim = 3;
}
