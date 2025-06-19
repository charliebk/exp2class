package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public abstract class IfcSectionedSolid extends IfcSolidModel {

    public IfcCurve Directrix;
    // INVERSE attributes:
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0;
    // DirectrixIs3D : Directrix.Dim = 3;
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0;

    // SUPERTYPE OF:
    // - IfcSectionedSolidHorizontal SUBTYPE OF IfcSolidModel

    // WHERE constraints:
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0;
    // DirectrixIs3D : Directrix.Dim = 3;
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0;
}
