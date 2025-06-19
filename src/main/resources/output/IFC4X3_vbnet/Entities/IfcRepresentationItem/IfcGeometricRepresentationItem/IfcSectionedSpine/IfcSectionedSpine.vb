Public Class IfcSectionedSpine Inherits IfcGeometricRepresentationItem
    Public SpineCurve As IfcCompositeCurve
    Public CrossSections As List(Of IfcProfileDef)
    Public CrossSectionPositions As List(Of IfcAxis2Placement3D)

    ' === WHERE CLAUSES ===
    ' ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    ' CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    ' SpineCurveDim : SpineCurve.Dim = 3

    ' === DERIVE CLAUSES ===
    ' Dim : IfcDimensionCount := 3
End Class
