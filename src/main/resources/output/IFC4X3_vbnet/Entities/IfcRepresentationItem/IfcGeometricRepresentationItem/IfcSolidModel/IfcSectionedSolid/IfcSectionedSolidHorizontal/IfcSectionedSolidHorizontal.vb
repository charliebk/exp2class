Public Class IfcSectionedSolidHorizontal Inherits IfcSectionedSolid
    Public CrossSectionPositions As List(Of IfcAxis2PlacementLinear)

    ' === WHERE CLAUSES ===
    ' CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    ' NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0
End Class
