class IfcPropertyBoundedValue extends IfcSimpleProperty {
    constructor() {
        /** @type {IFCVALUE} */
        this.UpperBoundValue = null;
        /** @type {IFCVALUE} */
        this.LowerBoundValue = null;
        /** @type {IFCUNIT} */
        this.Unit = null;
        /** @type {IFCVALUE} */
        this.SetPointValue = null;
    }

    // === WHERE CLAUSES ===
    // SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue))
    // SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue))
    // SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue))
}
