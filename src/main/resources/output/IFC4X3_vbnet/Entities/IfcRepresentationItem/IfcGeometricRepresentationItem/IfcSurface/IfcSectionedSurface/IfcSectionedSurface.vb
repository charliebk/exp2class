Public Class IfcSectionedSurface Inherits IfcSurface
    Public Directrix As IfcCurve
    Public CrossSectionPositions As List(Of IfcAxis2PlacementLinear)
    Public CrossSections As List(Of IfcProfileDef)

    ' === WHERE CLAUSES ===
    ' AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0
    ' CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    ' DirectrixIs3D : Directrix.Dim = 3
    ' NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0
    ' SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
End Class
