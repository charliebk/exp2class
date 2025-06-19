public class IfcWorkCalendar extends IfcControl {
    public SET [1:?] OF IfcWorkTime WorkingTimes;
    public SET [1:?] OF IfcWorkTime ExceptionTimes;
    public IfcWorkCalendarTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
}
