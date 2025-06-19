Public Class IfcRelAssignsToControl Inherits IfcRelAssigns
    Public RelatingControl As IfcControl

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0
End Class
