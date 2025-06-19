package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcActorRole {

    public IfcRoleEnum Role;
    public IfcLabel UserDefinedRole; // OPTIONAL
    public IfcText Description; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;
    // INVERSE attributes:
    // WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR
    // ((Role = IfcRoleEnum.USERDEFINED) AND
    // EXISTS(SELF.UserDefinedRole));

    // WHERE constraints:
    // WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR
    // ((Role = IfcRoleEnum.USERDEFINED) AND
    // EXISTS(SELF.UserDefinedRole));
}
