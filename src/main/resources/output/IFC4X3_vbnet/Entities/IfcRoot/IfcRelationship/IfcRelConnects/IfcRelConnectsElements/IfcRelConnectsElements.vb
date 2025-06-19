Public Class IfcRelConnectsElements Inherits IfcRelConnects
    Public ConnectionGeometry As IfcConnectionGeometry
    Public RelatingElement As IfcElement
    Public RelatedElement As IfcElement

    ' === EXTENDED BY ===
    ' IfcRelConnectsPathElements
    ' IfcRelConnectsWithRealizingElements

    ' === WHERE CLAUSES ===
    ' NoSelfReference : RelatingElement :<>: RelatedElement
End Class
