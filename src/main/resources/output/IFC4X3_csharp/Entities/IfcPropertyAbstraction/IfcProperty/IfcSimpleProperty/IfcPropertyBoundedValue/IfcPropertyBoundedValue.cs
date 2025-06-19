public class IfcPropertyBoundedValue : IfcSimpleProperty
{
    public IfcValue UpperBoundValue { get; set; }
    public IfcValue LowerBoundValue { get; set; }
    public IfcUnit Unit { get; set; }
    public IfcValue SetPointValue { get; set; }

    // === WHERE CLAUSES ===
    // SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue))
    // SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue))
    // SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue))
}
