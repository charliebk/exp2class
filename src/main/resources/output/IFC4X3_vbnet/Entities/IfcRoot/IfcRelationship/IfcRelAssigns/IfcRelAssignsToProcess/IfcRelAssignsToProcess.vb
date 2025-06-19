Public Class IfcRelAssignsToProcess Inherits IfcRelAssigns
    Public RelatingProcess As IfcProcessSelect
    Public QuantityInProcess As IfcMeasureWithUnit

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProcess :=: Temp)) = 0
End Class
