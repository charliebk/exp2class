package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcAddress {

    public IfcAddressTypeEnum Purpose; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcLabel UserDefinedPurpose; // OPTIONAL
    // INVERSE attributes:
    // OfPerson : SET [0:?] OF IfcPerson FOR Addresses;
    // OfOrganization : SET [0:?] OF IfcOrganization FOR Addresses;
    // INVERSE attributes:
    // WR1 : (NOT(EXISTS(Purpose))) OR
    // ((Purpose <> IfcAddressTypeEnum.USERDEFINED) OR
    // ((Purpose = IfcAddressTypeEnum.USERDEFINED) AND
    // EXISTS(SELF.UserDefinedPurpose)));

    // SUPERTYPE OF:
    // - IfcPostalAddress
    // - IfcTelecomAddress

    // WHERE constraints:
    // WR1 : (NOT(EXISTS(Purpose))) OR
    // ((Purpose <> IfcAddressTypeEnum.USERDEFINED) OR
    // ((Purpose = IfcAddressTypeEnum.USERDEFINED) AND
    // EXISTS(SELF.UserDefinedPurpose)));
}
