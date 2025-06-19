Public Class IfcPropertyListValue Inherits IfcSimpleProperty
    Public ListValues As List(Of IfcValue)
    Public Unit As IfcUnit

    ' === WHERE CLAUSES ===
    ' WR31 : SIZEOF(QUERY(temp <* SELF.ListValues | NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp)) )) = 0
End Class
