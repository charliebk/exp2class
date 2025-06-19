package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcProperty extends IfcPropertyAbstraction {

    public IfcIdentifier Name;
    public IfcText Specification; // OPTIONAL
    // INVERSE attributes:
    // PartOfPset : SET [0:?] OF IfcPropertySet FOR HasProperties;
    // PropertyForDependance : SET [0:?] OF IfcPropertyDependencyRelationship FOR DependingProperty;
    // PropertyDependsOn : SET [0:?] OF IfcPropertyDependencyRelationship FOR DependantProperty;
    // PartOfComplex : SET [0:?] OF IfcComplexProperty FOR HasProperties;
    // HasConstraints : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatedResourceObjects;
    // HasApprovals : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatedResourceObjects;

    // SUPERTYPE OF:
    // - IfcComplexProperty
    // - IfcSimpleProperty SUBTYPE OF IfcPropertyAbstraction
}
