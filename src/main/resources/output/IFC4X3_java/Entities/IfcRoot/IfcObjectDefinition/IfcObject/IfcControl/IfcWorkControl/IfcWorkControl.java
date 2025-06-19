public class IfcWorkControl extends IfcControl {
    public IfcDateTime CreationDate;
    public SET [1:?] OF IfcPerson Creators;
    public IfcLabel Purpose;
    public IfcDuration Duration;
    public IfcDuration TotalFloat;
    public IfcDateTime StartTime;
    public IfcDateTime FinishTime;

    // === EXTENDED BY ===
    // IfcWorkPlan
    // IfcWorkSchedule
}
