package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcApproval {

    public IfcIdentifier Identifier; // OPTIONAL
    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcDateTime TimeOfApproval; // OPTIONAL
    public IfcLabel Status; // OPTIONAL
    public IfcLabel Level; // OPTIONAL
    public IfcText Qualifier; // OPTIONAL
    public IfcActorSelect RequestingApproval; // OPTIONAL
    public IfcActorSelect GivingApproval; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;
    // ApprovedObjects : SET [0:?] OF IfcRelAssociatesApproval FOR RelatingApproval;
    // ApprovedResources : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatingApproval;
    // IsRelatedWith : SET [0:?] OF IfcApprovalRelationship FOR RelatedApprovals;
    // Relates : SET [0:?] OF IfcApprovalRelationship FOR RelatingApproval;
    // INVERSE attributes:
    // HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name);

    // WHERE constraints:
    // HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name);
}
