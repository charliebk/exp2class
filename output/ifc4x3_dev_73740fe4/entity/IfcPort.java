package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcPort extends IfcProduct {

    // INVERSE attributes:
    // ContainedIn : SET [0:1] OF IfcRelConnectsPortToElement FOR RelatingPort;
    // ConnectedFrom : SET [0:1] OF IfcRelConnectsPorts FOR RelatedPort;
    // ConnectedTo : SET [0:1] OF IfcRelConnectsPorts FOR RelatingPort;

    // SUPERTYPE OF:
    // - IfcDistributionPort SUBTYPE OF IfcProduct
}
