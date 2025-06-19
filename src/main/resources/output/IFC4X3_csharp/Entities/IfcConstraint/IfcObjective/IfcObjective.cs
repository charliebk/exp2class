public class IfcObjective : IfcConstraint
{
    public List<IfcConstraint> BenchmarkValues { get; set; }
    public IfcLogicalOperatorEnum LogicalAggregator { get; set; }
    public IfcObjectiveEnum ObjectiveQualifier { get; set; }
    public IfcLabel UserDefinedQualifier { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier))
}
