public class IfcWorkCalendar : IfcControl
{
    public SET [1:?] OF IfcWorkTime WorkingTimes { get; set; }
    public SET [1:?] OF IfcWorkTime ExceptionTimes { get; set; }
    public IfcWorkCalendarTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
}
