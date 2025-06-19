Public Class IfcRelCoversSpaces Inherits IfcRelConnects
    Public RelatingSpace As IfcSpace
    Public RelatedCoverings As SET [1:?] OF IfcCovering
End Class
