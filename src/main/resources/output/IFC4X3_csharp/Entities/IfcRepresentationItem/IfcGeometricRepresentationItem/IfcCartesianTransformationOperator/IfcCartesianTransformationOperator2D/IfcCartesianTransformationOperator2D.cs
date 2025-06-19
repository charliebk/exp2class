public class IfcCartesianTransformationOperator2D : IfcCartesianTransformationOperator
{

    // === EXTENDED BY ===
    // IfcCartesianTransformationOperator2DnonUniform

    // === WHERE CLAUSES ===
    // Axis1Is2D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis1)) OR (SELF\IfcCartesianTransformationOperator.Axis1.Dim = 2)
    // Axis2Is2D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis2)) OR (SELF\IfcCartesianTransformationOperator.Axis2.Dim = 2)
    // DimEqual2 : SELF\IfcCartesianTransformationOperator.Dim = 2

    // === DERIVE CLAUSES ===
    // U : LIST [2:2] OF IfcDirection := IfcBaseAxis(2,SELF\IfcCartesianTransformationOperator.Axis1, SELF\IfcCartesianTransformationOperator.Axis2,?)
}
