public class IfcWorkPlan : IfcWorkControl
{
    public IfcWorkPlanTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkPlanTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkPlanTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
}
