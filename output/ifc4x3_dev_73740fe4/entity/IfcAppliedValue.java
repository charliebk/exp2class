package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcAppliedValue {

    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcAppliedValueSelect AppliedValue; // OPTIONAL
    public IfcMeasureWithUnit UnitBasis; // OPTIONAL
    public IfcDate ApplicableDate; // OPTIONAL
    public IfcDate FixedUntilDate; // OPTIONAL
    public IfcLabel Category; // OPTIONAL
    public IfcLabel Condition; // OPTIONAL
    public IfcArithmeticOperatorEnum ArithmeticOperator; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;

    // SUPERTYPE OF:
    // - IfcCostValue
}
