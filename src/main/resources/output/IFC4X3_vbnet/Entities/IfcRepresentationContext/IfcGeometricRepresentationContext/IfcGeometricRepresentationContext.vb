Public Class IfcGeometricRepresentationContext Inherits IfcRepresentationContext
    Public CoordinateSpaceDimension As IfcDimensionCount
    Public Precision As IfcReal
    Public WorldCoordinateSystem As IfcAxis2Placement
    Public TrueNorth As IfcDirection

    ' === EXTENDED BY ===
    ' IfcGeometricRepresentationSubContext

    ' === INVERSE CLAUSES ===
    ' HasSubContexts : SET [0:?] OF IfcGeometricRepresentationSubContext FOR ParentContext
    ' HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS

    ' === WHERE CLAUSES ===
    ' North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2)
End Class
