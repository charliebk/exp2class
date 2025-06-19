Public Class IfcSurfaceOfRevolution Inherits IfcSweptSurface
    Public AxisPosition As IfcAxis1Placement

    ' === DERIVE CLAUSES ===
    ' AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(AxisPosition.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(AxisPosition.Z,1.0))
End Class
