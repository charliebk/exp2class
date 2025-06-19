Public Class IfcRelConnectsWithRealizingElements Inherits IfcRelConnectsElements
    Public RealizingElements As SET [1:?] OF IfcElement
    Public ConnectionType As IfcLabel
End Class
