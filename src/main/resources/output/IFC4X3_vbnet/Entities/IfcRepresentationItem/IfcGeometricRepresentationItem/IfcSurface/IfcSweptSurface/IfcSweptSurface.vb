Public Class IfcSweptSurface Inherits IfcSurface
    Public SweptCurve As IfcProfileDef
    Public Position As IfcAxis2Placement3D

    ' === EXTENDED BY ===
    ' IfcSurfaceOfLinearExtrusion
    ' IfcSurfaceOfRevolution

    ' === WHERE CLAUSES ===
    ' SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve
End Class
