Public Class IfcOpenCrossProfileDef Inherits IfcProfileDef
    Public HorizontalWidths As IfcBoolean
    Public Widths As List(Of IfcNonNegativeLengthMeasure)
    Public Slopes As List(Of IfcPlaneAngleMeasure)
    Public Tags As List(Of IfcLabel)
    Public OffsetPoint As IfcCartesianPoint

    ' === WHERE CLAUSES ===
    ' CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE
    ' CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths)
    ' CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1))
End Class
