Public Class IfcFillAreaStyleTiles Inherits IfcGeometricRepresentationItem
    Public TilingPattern As List(Of IfcVector)
    Public Tiles As SET [1:?] OF IfcStyledItem
    Public TilingScale As IfcPositiveRatioMeasure
End Class
