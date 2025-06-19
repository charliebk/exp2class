Public Class IfcRelFlowControlElements Inherits IfcRelConnects
    Public RelatedControlElements As SET [1:?] OF IfcDistributionControlElement
    Public RelatingFlowElement As IfcDistributionFlowElement
End Class
