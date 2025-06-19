package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcSectionedSurface extends IfcSurface {

    public IfcCurve Directrix;
    // INVERSE attributes:
    // AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0;
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions);
    // DirectrixIs3D : Directrix.Dim = 3;
    // NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0;
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0;

    // WHERE constraints:
    // AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0;
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions);
    // DirectrixIs3D : Directrix.Dim = 3;
    // NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0;
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0;
}
