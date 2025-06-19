public class IfcTaskType : IfcTypeProcess
{
    public IfcTaskTypeEnum PredefinedType { get; set; }
    public IfcLabel WorkMethod { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
}
