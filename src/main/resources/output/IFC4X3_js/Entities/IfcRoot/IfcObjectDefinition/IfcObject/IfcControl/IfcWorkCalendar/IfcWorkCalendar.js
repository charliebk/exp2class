class IfcWorkCalendar extends IfcControl {
    constructor() {
        /** @type {SET [1:?] OF IFCWORKTIME} */
        this.WorkingTimes = null;
        /** @type {SET [1:?] OF IFCWORKTIME} */
        this.ExceptionTimes = null;
        /** @type {IFCWORKCALENDARTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
}
