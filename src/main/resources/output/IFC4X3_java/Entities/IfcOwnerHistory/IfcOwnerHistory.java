public class IfcOwnerHistory {
    public IfcPersonAndOrganization OwningUser;
    public IfcApplication OwningApplication;
    public IfcStateEnum State;
    public IfcChangeActionEnum ChangeAction;
    public IfcTimeStamp LastModifiedDate;
    public IfcPersonAndOrganization LastModifyingUser;
    public IfcApplication LastModifyingApplication;
    public IfcTimeStamp CreationDate;

    // === WHERE CLAUSES ===
    // CorrectChangeAction : (EXISTS(LastModifiedDate)) OR (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)))
}
