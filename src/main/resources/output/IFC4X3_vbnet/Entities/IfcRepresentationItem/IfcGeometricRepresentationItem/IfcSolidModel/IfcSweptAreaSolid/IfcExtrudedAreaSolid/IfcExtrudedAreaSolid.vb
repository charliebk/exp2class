Public Class IfcExtrudedAreaSolid Inherits IfcSweptAreaSolid
    Public ExtrudedDirection As IfcDirection
    Public Depth As IfcPositiveLengthMeasure

    ' === EXTENDED BY ===
    ' IfcExtrudedAreaSolidTapered

    ' === WHERE CLAUSES ===
    ' ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0
End Class
