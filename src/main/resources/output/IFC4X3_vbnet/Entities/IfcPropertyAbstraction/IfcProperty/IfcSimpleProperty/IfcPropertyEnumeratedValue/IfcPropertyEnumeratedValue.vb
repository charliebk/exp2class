Public Class IfcPropertyEnumeratedValue Inherits IfcSimpleProperty
    Public EnumerationValues As List(Of IfcValue)
    Public EnumerationReference As IfcPropertyEnumeration

    ' === WHERE CLAUSES ===
    ' WR21 : NOT(EXISTS(EnumerationReference)) OR  NOT(EXISTS(EnumerationValues)) OR  (SIZEOF(QUERY(temp <* EnumerationValues | temp IN EnumerationReference.EnumerationValues)) = SIZEOF(EnumerationValues))
End Class
