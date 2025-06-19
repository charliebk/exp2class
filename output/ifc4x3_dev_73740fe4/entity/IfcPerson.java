package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcPerson {

    public IfcIdentifier Identification; // OPTIONAL
    public IfcLabel FamilyName; // OPTIONAL
    public IfcLabel GivenName; // OPTIONAL
    // INVERSE attributes:
    // EngagedIn : SET [0:?] OF IfcPersonAndOrganization FOR ThePerson;
    // INVERSE attributes:
    // IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName);
    // ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName);

    // WHERE constraints:
    // IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName);
    // ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName);
}
