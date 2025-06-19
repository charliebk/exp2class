class IfcOwnerHistory {
    constructor() {
        /** @type {IFCPERSONANDORGANIZATION} */
        this.OwningUser = null;
        /** @type {IFCAPPLICATION} */
        this.OwningApplication = null;
        /** @type {IFCSTATEENUM} */
        this.State = null;
        /** @type {IFCCHANGEACTIONENUM} */
        this.ChangeAction = null;
        /** @type {IFCTIMESTAMP} */
        this.LastModifiedDate = null;
        /** @type {IFCPERSONANDORGANIZATION} */
        this.LastModifyingUser = null;
        /** @type {IFCAPPLICATION} */
        this.LastModifyingApplication = null;
        /** @type {IFCTIMESTAMP} */
        this.CreationDate = null;
    }

    // === WHERE CLAUSES ===
    // CorrectChangeAction : (EXISTS(LastModifiedDate)) OR (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)))
}
