package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcSectionedSolidHorizontal extends IfcSectionedSolid {

    // INVERSE attributes:
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions);
    // NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0;

    // WHERE constraints:
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions);
    // NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0;
}
