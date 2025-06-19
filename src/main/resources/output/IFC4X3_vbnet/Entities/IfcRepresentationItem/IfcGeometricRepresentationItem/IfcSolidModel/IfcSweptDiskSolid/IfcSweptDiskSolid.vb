Public Class IfcSweptDiskSolid Inherits IfcSolidModel
    Public Directrix As IfcCurve
    Public Radius As IfcPositiveLengthMeasure
    Public InnerRadius As IfcPositiveLengthMeasure
    Public StartParam As IfcParameterValue
    Public EndParam As IfcParameterValue

    ' === EXTENDED BY ===
    ' IfcSweptDiskSolidPolygonal

    ' === WHERE CLAUSES ===
    ' DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
    ' DirectrixDim : Directrix.Dim = 3
    ' InnerRadiusSize : (NOT EXISTS(InnerRadius)) OR (Radius > InnerRadius)
End Class
