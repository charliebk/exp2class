public class IfcWorkPlan extends IfcWorkControl {
    public IfcWorkPlanTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkPlanTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkPlanTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
}
