Public Class IfcRelAssignsToProduct Inherits IfcRelAssigns
    Public RelatingProduct As IfcProductSelect

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProduct :=: Temp)) = 0
End Class
