Public Class IfcRelServicesBuildings Inherits IfcRelConnects
    Public RelatingSystem As IfcSystem
    Public RelatedBuildings As SET [1:?] OF IfcSpatialElement
End Class
