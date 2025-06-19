public class IfcObjective extends IfcConstraint {
    public List<IfcConstraint> BenchmarkValues;
    public IfcLogicalOperatorEnum LogicalAggregator;
    public IfcObjectiveEnum ObjectiveQualifier;
    public IfcLabel UserDefinedQualifier;

    // === WHERE CLAUSES ===
    // WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier))
}
