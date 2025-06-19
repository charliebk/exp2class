Public Class IfcBoxedHalfSpace Inherits IfcHalfSpaceSolid
    Public Enclosure As IfcBoundingBox

    ' === WHERE CLAUSES ===
    ' UnboundedSurface : NOT ('IFC4X3_DEV_73740fe4.IFCCURVEBOUNDEDPLANE' IN TYPEOF(SELF\IfcHalfSpaceSolid.BaseSurface))
End Class
