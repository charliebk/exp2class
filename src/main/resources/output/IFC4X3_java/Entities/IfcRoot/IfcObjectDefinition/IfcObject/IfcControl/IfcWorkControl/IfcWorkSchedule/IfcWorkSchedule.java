public class IfcWorkSchedule extends IfcWorkControl {
    public IfcWorkScheduleTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkScheduleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkScheduleTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
}
