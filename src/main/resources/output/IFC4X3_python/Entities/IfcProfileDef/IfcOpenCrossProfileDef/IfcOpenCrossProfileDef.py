from typing import List

class IfcOpenCrossProfileDef(IfcProfileDef):
    def __init__(self):
        self.HorizontalWidths: IfcBoolean = None
        self.Widths: List[IfcNonNegativeLengthMeasure] = None
        self.Slopes: List[IfcPlaneAngleMeasure] = None
        self.Tags: List[IfcLabel] = None
        self.OffsetPoint: IfcCartesianPoint = None

    # === WHERE CLAUSES ===
    # CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE
    # CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths)
    # CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1))
