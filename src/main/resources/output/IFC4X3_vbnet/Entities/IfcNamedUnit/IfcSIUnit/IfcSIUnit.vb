Public Class IfcSIUnit Inherits IfcNamedUnit
    Public Prefix As IfcSIPrefix
    Public Name As IfcSIUnitName

    ' === DERIVE CLAUSES ===
    ' SELF\IfcNamedUnit.Dimensions : IfcDimensionalExponents := IfcDimensionsForSIUnit (SELF.Name)
End Class
