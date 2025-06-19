Public Class IfcRelAdheresToElement Inherits IfcRelDecomposes
    Public RelatingElement As IfcElement
    Public RelatedSurfaceFeatures As SET [1:?] OF IfcSurfaceFeature
End Class
