Public Class IfcBlobTexture Inherits IfcSurfaceTexture
    Public RasterFormat As IfcIdentifier
    Public RasterCode As IfcBinary

    ' === WHERE CLAUSES ===
    ' RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0
    ' SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG']
End Class
