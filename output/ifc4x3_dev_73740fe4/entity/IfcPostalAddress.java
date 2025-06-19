package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcPostalAddress extends IfcAddress {

    public IfcLabel InternalLocation; // OPTIONAL
    public IfcLabel PostalBox; // OPTIONAL
    public IfcLabel Town; // OPTIONAL
    public IfcLabel Region; // OPTIONAL
    public IfcLabel PostalCode; // OPTIONAL
    public IfcLabel Country; // OPTIONAL
    // INVERSE attributes:
    // WR1 : EXISTS (InternalLocation) OR
    // EXISTS (AddressLines) OR
    // EXISTS (PostalBox) OR
    // EXISTS (PostalCode) OR
    // EXISTS (Town) OR
    // EXISTS (Region) OR
    // EXISTS (Country);

    // WHERE constraints:
    // WR1 : EXISTS (InternalLocation) OR
    // EXISTS (AddressLines) OR
    // EXISTS (PostalBox) OR
    // EXISTS (PostalCode) OR
    // EXISTS (Town) OR
    // EXISTS (Region) OR
    // EXISTS (Country);
}
