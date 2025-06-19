package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPropertyBoundedValue extends IfcSimpleProperty {

    public IfcValue UpperBoundValue; // OPTIONAL
    public IfcValue LowerBoundValue; // OPTIONAL
    public IfcUnit Unit; // OPTIONAL
    public IfcValue SetPointValue; // OPTIONAL
    // INVERSE attributes:
    // SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR
    // (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue));
    // SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR
    // (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue));
    // SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR
    // (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue));

    // WHERE constraints:
    // SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR
    // (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue));
    // SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR
    // (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue));
    // SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR
    // (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue));
}
