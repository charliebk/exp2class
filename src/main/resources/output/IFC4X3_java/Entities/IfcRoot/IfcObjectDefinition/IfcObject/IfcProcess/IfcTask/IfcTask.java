public class IfcTask extends IfcProcess {
    public IfcLabel Status;
    public IfcLabel WorkMethod;
    public IfcBoolean IsMilestone;
    public IfcInteger Priority;
    public IfcTaskTime TaskTime;
    public IfcTaskTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    // HasName : EXISTS(SELF\IfcRoot.Name)
}
