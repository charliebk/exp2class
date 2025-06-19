Public Class IfcRelInterferesElements Inherits IfcRelConnects
    Public RelatingElement As IfcInterferenceSelect
    Public RelatedElement As IfcInterferenceSelect
    Public InterferenceGeometry As IfcConnectionGeometry
    Public InterferenceType As IfcIdentifier
    Public ImpliedOrder As IfcLogical
    Public InterferenceSpace As IfcSpatialZone

    ' === WHERE CLAUSES ===
    ' NoSelfReference : RelatingElement :<>: RelatedElement
End Class
