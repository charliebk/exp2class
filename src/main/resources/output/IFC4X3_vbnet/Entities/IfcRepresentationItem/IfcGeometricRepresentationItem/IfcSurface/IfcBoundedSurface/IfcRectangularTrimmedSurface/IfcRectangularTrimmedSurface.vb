Public Class IfcRectangularTrimmedSurface Inherits IfcBoundedSurface
    Public BasisSurface As IfcSurface
    Public U1 As IfcParameterValue
    Public V1 As IfcParameterValue
    Public U2 As IfcParameterValue
    Public V2 As IfcParameterValue
    Public Usense As IfcBoolean
    Public Vsense As IfcBoolean

    ' === WHERE CLAUSES ===
    ' U1AndU2Different : U1 <> U2
    ' UsenseCompatible : (('IFC4X3_DEV_73740fe4.IFCELEMENTARYSURFACE' IN TYPEOF(BasisSurface)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCPLANE' IN TYPEOF(BasisSurface)))) OR ('IFC4X3_DEV_73740fe4.IFCSURFACEOFREVOLUTION' IN TYPEOF(BasisSurface)) OR (Usense = (U2 > U1))
    ' V1AndV2Different : V1 <> V2
    ' VsenseCompatible : Vsense = (V2 > V1)
End Class
