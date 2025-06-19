package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcOrganization {

    public IfcIdentifier Identification; // OPTIONAL
    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    // INVERSE attributes:
    // IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations;
    // Relates : SET [0:?] OF IfcOrganizationRelationship FOR RelatingOrganization;
    // Engages : SET [0:?] OF IfcPersonAndOrganization FOR TheOrganization;
}
