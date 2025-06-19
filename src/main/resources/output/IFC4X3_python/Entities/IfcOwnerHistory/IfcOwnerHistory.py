class IfcOwnerHistory:
    def __init__(self):
        self.OwningUser: IfcPersonAndOrganization = None
        self.OwningApplication: IfcApplication = None
        self.State: IfcStateEnum = None
        self.ChangeAction: IfcChangeActionEnum = None
        self.LastModifiedDate: IfcTimeStamp = None
        self.LastModifyingUser: IfcPersonAndOrganization = None
        self.LastModifyingApplication: IfcApplication = None
        self.CreationDate: IfcTimeStamp = None

    # === WHERE CLAUSES ===
    # CorrectChangeAction : (EXISTS(LastModifiedDate)) OR (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)))
