Public Class IfcRelConnectsPorts Inherits IfcRelConnects
    Public RelatingPort As IfcPort
    Public RelatedPort As IfcPort
    Public RealizingElement As IfcElement

    ' === WHERE CLAUSES ===
    ' NoSelfReference : RelatingPort :<>: RelatedPort
End Class
