package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcCartesianTransformationOperator2D extends IfcCartesianTransformationOperator {

    // INVERSE attributes:
    // U : LIST [2:2] OF IfcDirection := IfcBaseAxis(2,SELF\IfcCartesianTransformationOperator.Axis1,
    // SELF\IfcCartesianTransformationOperator.Axis2,?);
    // INVERSE attributes:
    // Axis1Is2D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis1)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis1.Dim = 2);
    // Axis2Is2D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis2)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis2.Dim = 2);
    // DimEqual2 : SELF\IfcCartesianTransformationOperator.Dim = 2;

    // SUPERTYPE OF:
    // - IfcCartesianTransformationOperator2DnonUniform SUBTYPE OF IfcCartesianTransformationOperator

    // WHERE constraints:
    // Axis1Is2D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis1)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis1.Dim = 2);
    // Axis2Is2D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis2)) OR
    // (SELF\IfcCartesianTransformationOperator.Axis2.Dim = 2);
    // DimEqual2 : SELF\IfcCartesianTransformationOperator.Dim = 2;
}
