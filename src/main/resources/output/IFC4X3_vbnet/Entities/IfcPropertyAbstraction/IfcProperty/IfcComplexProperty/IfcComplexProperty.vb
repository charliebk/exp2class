Public Class IfcComplexProperty Inherits IfcProperty
    Public UsageName As IfcIdentifier
    Public HasProperties As SET [1:?] OF IfcProperty

    ' === WHERE CLAUSES ===
    ' WR21 : SIZEOF(QUERY(temp <* HasProperties | SELF :=: temp)) = 0
    ' WR22 : IfcUniquePropertyName(HasProperties)
End Class
