package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcCompositeProfileDef extends IfcProfileDef {

    public IfcLabel Label; // OPTIONAL
    // INVERSE attributes:
    // InvariantProfileType : SIZEOF(QUERY(temp <* Profiles | temp.ProfileType <> Profiles[1].ProfileType)) = 0;
    // NoRecursion : SIZEOF(QUERY(temp <* Profiles | 'IFC4X3_DEV_73740fe4.IFCCOMPOSITEPROFILEDEF' IN TYPEOF(temp))) = 0;

    // WHERE constraints:
    // InvariantProfileType : SIZEOF(QUERY(temp <* Profiles | temp.ProfileType <> Profiles[1].ProfileType)) = 0;
    // NoRecursion : SIZEOF(QUERY(temp <* Profiles | 'IFC4X3_DEV_73740fe4.IFCCOMPOSITEPROFILEDEF' IN TYPEOF(temp))) = 0;
}
