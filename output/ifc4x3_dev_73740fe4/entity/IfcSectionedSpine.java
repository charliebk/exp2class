package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcSectionedSpine extends IfcGeometricRepresentationItem {

    public IfcCompositeCurve SpineCurve;
    // INVERSE attributes:
    // Dim : IfcDimensionCount := 3;
    // INVERSE attributes:
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0;
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions);
    // SpineCurveDim : SpineCurve.Dim = 3;

    // WHERE constraints:
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0;
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions);
    // SpineCurveDim : SpineCurve.Dim = 3;
}
