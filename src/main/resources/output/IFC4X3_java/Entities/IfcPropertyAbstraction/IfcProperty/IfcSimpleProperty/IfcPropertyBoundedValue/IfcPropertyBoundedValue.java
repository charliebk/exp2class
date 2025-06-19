public class IfcPropertyBoundedValue extends IfcSimpleProperty {
    public IfcValue UpperBoundValue;
    public IfcValue LowerBoundValue;
    public IfcUnit Unit;
    public IfcValue SetPointValue;

    // === WHERE CLAUSES ===
    // SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue))
    // SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue))
    // SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue))
}
