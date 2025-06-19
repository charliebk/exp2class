Public Class IfcRelAssignsToResource Inherits IfcRelAssigns
    Public RelatingResource As IfcResourceSelect

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingResource :=: Temp)) = 0
End Class
