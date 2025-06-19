public class IfcTaskType extends IfcTypeProcess {
    public IfcTaskTypeEnum PredefinedType;
    public IfcLabel WorkMethod;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
}
