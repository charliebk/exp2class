class IfcPropertyBoundedValue(IfcSimpleProperty):
    def __init__(self):
        self.UpperBoundValue: IfcValue = None
        self.LowerBoundValue: IfcValue = None
        self.Unit: IfcUnit = None
        self.SetPointValue: IfcValue = None

    # === WHERE CLAUSES ===
    # SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue))
    # SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue))
    # SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue))
