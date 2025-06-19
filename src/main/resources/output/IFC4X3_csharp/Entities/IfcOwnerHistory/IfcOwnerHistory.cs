public class IfcOwnerHistory
{
    public IfcPersonAndOrganization OwningUser { get; set; }
    public IfcApplication OwningApplication { get; set; }
    public IfcStateEnum State { get; set; }
    public IfcChangeActionEnum ChangeAction { get; set; }
    public IfcTimeStamp LastModifiedDate { get; set; }
    public IfcPersonAndOrganization LastModifyingUser { get; set; }
    public IfcApplication LastModifyingApplication { get; set; }
    public IfcTimeStamp CreationDate { get; set; }

    // === WHERE CLAUSES ===
    // CorrectChangeAction : (EXISTS(LastModifiedDate)) OR (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)))
}
