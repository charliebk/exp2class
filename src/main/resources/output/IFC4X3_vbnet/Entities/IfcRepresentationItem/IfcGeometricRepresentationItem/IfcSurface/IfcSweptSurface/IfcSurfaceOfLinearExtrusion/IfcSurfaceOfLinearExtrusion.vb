Public Class IfcSurfaceOfLinearExtrusion Inherits IfcSweptSurface
    Public ExtrudedDirection As IfcDirection
    Public Depth As IfcLengthMeasure

    ' === WHERE CLAUSES ===
    ' DepthGreaterZero : Depth > 0.

    ' === DERIVE CLAUSES ===
    ' ExtrusionAxis : IfcVector := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector (ExtrudedDirection, Depth)
End Class
