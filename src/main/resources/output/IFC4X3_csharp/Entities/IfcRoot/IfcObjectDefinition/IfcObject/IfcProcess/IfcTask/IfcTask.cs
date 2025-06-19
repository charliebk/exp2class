public class IfcTask : IfcProcess
{
    public IfcLabel Status { get; set; }
    public IfcLabel WorkMethod { get; set; }
    public IfcBoolean IsMilestone { get; set; }
    public IfcInteger Priority { get; set; }
    public IfcTaskTime TaskTime { get; set; }
    public IfcTaskTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // HasName : EXISTS(SELF\IfcRoot.Name)
}
