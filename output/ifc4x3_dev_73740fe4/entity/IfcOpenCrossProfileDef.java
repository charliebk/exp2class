package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcOpenCrossProfileDef extends IfcProfileDef {

    public IfcBoolean HorizontalWidths;
    public IfcCartesianPoint OffsetPoint; // OPTIONAL
    // INVERSE attributes:
    // CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE;
    // CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths);
    // CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1));

    // WHERE constraints:
    // CorrectProfileType : SELF\IfcProfileDef.ProfileType = IfcProfileTypeEnum.CURVE;
    // CorrespondingSlopeWidths : SIZEOF(Slopes) = SIZEOF(Widths);
    // CorrespondingTags : (NOT EXISTS (Tags)) OR (SIZEOF(Tags) = (SIZEOF(Slopes) + 1));
}
