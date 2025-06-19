Public Class IfcOwnerHistory
    Public OwningUser As IfcPersonAndOrganization
    Public OwningApplication As IfcApplication
    Public State As IfcStateEnum
    Public ChangeAction As IfcChangeActionEnum
    Public LastModifiedDate As IfcTimeStamp
    Public LastModifyingUser As IfcPersonAndOrganization
    Public LastModifyingApplication As IfcApplication
    Public CreationDate As IfcTimeStamp

    ' === WHERE CLAUSES ===
    ' CorrectChangeAction : (EXISTS(LastModifiedDate)) OR (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)))
End Class
