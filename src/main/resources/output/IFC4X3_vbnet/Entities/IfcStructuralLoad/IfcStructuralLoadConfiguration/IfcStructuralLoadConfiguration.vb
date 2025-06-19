Public Class IfcStructuralLoadConfiguration Inherits IfcStructuralLoad
    Public Values As List(Of IfcStructuralLoadOrResult)
    Public Locations As List(Of UNIQUE LIST [1:2] OF IfcLengthMeasure)

    ' === WHERE CLAUSES ===
    ' ValidListSize : NOT EXISTS(Locations) OR (SIZEOF(Locations) = SIZEOF(Values))
End Class
