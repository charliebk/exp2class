Public Class IfcRelCoversBldgElements Inherits IfcRelConnects
    Public RelatingBuildingElement As IfcElement
    Public RelatedCoverings As SET [1:?] OF IfcCovering
End Class
