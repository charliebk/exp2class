Public Class IfcPixelTexture Inherits IfcSurfaceTexture
    Public Width As IfcInteger
    Public Height As IfcInteger
    Public ColourComponents As IfcInteger
    Public Pixel As List(Of IfcBinary)

    ' === WHERE CLAUSES ===
    ' MinPixelInS : Width >= 1
    ' MinPixelInT : Height >= 1
    ' NumberOfColours : {1 <= ColourComponents <= 4}
    ' PixelAsByteAndSameLength : SIZEOF(QUERY(temp<* Pixel | (BLENGTH(temp) MOD 8 = 0) AND (BLENGTH(temp) = BLENGTH(Pixel[1])) )) = SIZEOF(Pixel)
    ' SizeOfPixelList : SIZEOF(Pixel) = (Width * Height)
End Class
