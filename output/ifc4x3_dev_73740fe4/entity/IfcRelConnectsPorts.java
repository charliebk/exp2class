package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelConnectsPorts extends IfcRelConnects {

    public IfcPort RelatingPort;
    public IfcPort RelatedPort;
    public IfcElement RealizingElement; // OPTIONAL
    // INVERSE attributes:
    // NoSelfReference : RelatingPort :<>: RelatedPort;

    // WHERE constraints:
    // NoSelfReference : RelatingPort :<>: RelatedPort;
}
