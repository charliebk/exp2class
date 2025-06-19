Public Class IfcRelAssignsToGroup Inherits IfcRelAssigns
    Public RelatingGroup As IfcGroup

    ' === EXTENDED BY ===
    ' IfcRelAssignsToGroupByFactor

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0
End Class
