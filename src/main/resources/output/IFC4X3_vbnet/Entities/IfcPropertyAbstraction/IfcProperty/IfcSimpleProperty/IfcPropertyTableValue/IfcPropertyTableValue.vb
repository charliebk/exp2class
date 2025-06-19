Public Class IfcPropertyTableValue Inherits IfcSimpleProperty
    Public DefiningValues As List(Of UNIQUE IfcValue)
    Public DefinedValues As List(Of IfcValue)
    Public Expression As IfcText
    Public DefiningUnit As IfcUnit
    Public DefinedUnit As IfcUnit
    Public CurveInterpolation As IfcCurveInterpolationEnum

    ' === WHERE CLAUSES ===
    ' WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues))) OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues))
    ' WR22 : NOT(EXISTS(DefiningValues)) OR (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1]) )) = 0)
    ' WR23 : NOT(EXISTS(DefinedValues)) OR (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1]) )) = 0)
End Class
