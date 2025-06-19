public class IfcAppliedValue
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcAppliedValueSelect AppliedValue { get; set; }
    public IfcMeasureWithUnit UnitBasis { get; set; }
    public IfcDate ApplicableDate { get; set; }
    public IfcDate FixedUntilDate { get; set; }
    public IfcLabel Category { get; set; }
    public IfcLabel Condition { get; set; }
    public IfcArithmeticOperatorEnum ArithmeticOperator { get; set; }
    public List<IfcAppliedValue> Components { get; set; }

    // === EXTENDED BY ===
    // IfcCostValue

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
