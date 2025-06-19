public class IfcAppliedValue {
    public IfcLabel Name;
    public IfcText Description;
    public IfcAppliedValueSelect AppliedValue;
    public IfcMeasureWithUnit UnitBasis;
    public IfcDate ApplicableDate;
    public IfcDate FixedUntilDate;
    public IfcLabel Category;
    public IfcLabel Condition;
    public IfcArithmeticOperatorEnum ArithmeticOperator;
    public List<IfcAppliedValue> Components;

    // === EXTENDED BY ===
    // IfcCostValue

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
