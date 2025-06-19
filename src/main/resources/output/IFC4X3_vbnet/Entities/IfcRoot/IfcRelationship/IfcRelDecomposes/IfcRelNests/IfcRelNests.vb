Public Class IfcRelNests Inherits IfcRelDecomposes
    Public RelatingObject As IfcObjectDefinition
    Public RelatedObjects As List(Of IfcObjectDefinition)

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
End Class
