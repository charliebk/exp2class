package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcTelecomAddress extends IfcAddress {

    public IfcLabel PagerNumber; // OPTIONAL
    public IfcURIReference WWWHomePageURL; // OPTIONAL
    // INVERSE attributes:
    // MinimumDataProvided : EXISTS (TelephoneNumbers) OR
    // EXISTS (FacsimileNumbers) OR
    // EXISTS (PagerNumber) OR
    // EXISTS (ElectronicMailAddresses) OR
    // EXISTS (WWWHomePageURL) OR
    // EXISTS (MessagingIDs);

    // WHERE constraints:
    // MinimumDataProvided : EXISTS (TelephoneNumbers) OR
    // EXISTS (FacsimileNumbers) OR
    // EXISTS (PagerNumber) OR
    // EXISTS (ElectronicMailAddresses) OR
    // EXISTS (WWWHomePageURL) OR
    // EXISTS (MessagingIDs);
}
