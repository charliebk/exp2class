Public Class IfcDirectrixCurveSweptAreaSolid Inherits IfcSweptAreaSolid
    Public Directrix As IfcCurve
    Public StartParam As IfcCurveMeasureSelect
    Public EndParam As IfcCurveMeasureSelect

    ' === EXTENDED BY ===
    ' IfcFixedReferenceSweptAreaSolid
    ' IfcSurfaceCurveSweptAreaSolid

    ' === WHERE CLAUSES ===
    ' DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
End Class
