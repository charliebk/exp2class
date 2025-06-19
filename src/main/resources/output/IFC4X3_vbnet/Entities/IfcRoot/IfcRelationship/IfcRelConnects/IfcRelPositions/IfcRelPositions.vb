Public Class IfcRelPositions Inherits IfcRelConnects
    Public RelatingPositioningElement As IfcPositioningElement
    Public RelatedProducts As SET [1:?] OF IfcProduct

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0
End Class
