Public Class IfcCompositeCurveSegment Inherits IfcSegment
    Public SameSense As IfcBoolean
    Public ParentCurve As IfcCurve

    ' === EXTENDED BY ===
    ' IfcReparametrisedCompositeCurveSegment

    ' === WHERE CLAUSES ===
    ' ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve))
End Class
