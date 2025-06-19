Public Class IfcPropertyEnumeration Inherits IfcPropertyAbstraction
    Public Name As IfcLabel
    Public EnumerationValues As List(Of UNIQUE IfcValue)
    Public Unit As IfcUnit

    ' === WHERE CLAUSES ===
    ' WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues | NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp)) )) = 0

    ' === UNIQUE CLAUSES ===
    ' UR1 : Name
End Class
