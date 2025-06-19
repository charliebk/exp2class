Public Class IfcCartesianTransformationOperator3D Inherits IfcCartesianTransformationOperator
    Public Axis3 As IfcDirection

    ' === EXTENDED BY ===
    ' IfcCartesianTransformationOperator3DnonUniform

    ' === WHERE CLAUSES ===
    ' Axis1Is3D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis1)) OR (SELF\IfcCartesianTransformationOperator.Axis1.Dim = 3)
    ' Axis2Is3D : NOT(EXISTS(SELF\IfcCartesianTransformationOperator.Axis2)) OR (SELF\IfcCartesianTransformationOperator.Axis2.Dim = 3)
    ' Axis3Is3D : NOT(EXISTS(Axis3)) OR (Axis3.Dim = 3)
    ' DimIs3D : SELF\IfcCartesianTransformationOperator.Dim = 3

    ' === DERIVE CLAUSES ===
    ' U : LIST [3:3] OF IfcDirection := IfcBaseAxis(3,SELF\IfcCartesianTransformationOperator.Axis1, SELF\IfcCartesianTransformationOperator.Axis2,Axis3)
End Class
