Public Class IfcSurfaceTexture Inherits IfcPresentationItem
    Public RepeatS As IfcBoolean
    Public RepeatT As IfcBoolean
    Public Mode As IfcIdentifier
    Public TextureTransform As IfcCartesianTransformationOperator2D
    Public Parameter As List(Of IfcIdentifier)

    ' === EXTENDED BY ===
    ' IfcBlobTexture
    ' IfcImageTexture
    ' IfcPixelTexture

    ' === INVERSE CLAUSES ===
    ' IsMappedBy : SET [0:?] OF IfcTextureCoordinate FOR Maps
    ' UsedInStyles : SET [0:?] OF IfcSurfaceStyleWithTextures FOR Textures
End Class
