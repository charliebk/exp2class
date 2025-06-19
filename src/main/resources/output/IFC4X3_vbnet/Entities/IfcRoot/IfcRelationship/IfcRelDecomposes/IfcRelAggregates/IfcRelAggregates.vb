Public Class IfcRelAggregates Inherits IfcRelDecomposes
    Public RelatingObject As IfcObjectDefinition
    Public RelatedObjects As SET [1:?] OF IfcObjectDefinition

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
End Class
