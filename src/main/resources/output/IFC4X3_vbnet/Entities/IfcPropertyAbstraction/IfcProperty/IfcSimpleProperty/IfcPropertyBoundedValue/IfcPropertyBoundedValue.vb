Public Class IfcPropertyBoundedValue Inherits IfcSimpleProperty
    Public UpperBoundValue As IfcValue
    Public LowerBoundValue As IfcValue
    Public Unit As IfcUnit
    Public SetPointValue As IfcValue

    ' === WHERE CLAUSES ===
    ' SameUnitLowerSet : NOT(EXISTS(LowerBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(LowerBoundValue) = TYPEOF(SetPointValue))
    ' SameUnitUpperLower : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(LowerBoundValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(LowerBoundValue))
    ' SameUnitUpperSet : NOT(EXISTS(UpperBoundValue)) OR NOT(EXISTS(SetPointValue)) OR (TYPEOF(UpperBoundValue) = TYPEOF(SetPointValue))
End Class
