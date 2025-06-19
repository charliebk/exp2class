Public Class IfcRelAssignsToActor Inherits IfcRelAssigns
    Public RelatingActor As IfcActor
    Public ActingRole As IfcActorRole

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0
End Class
