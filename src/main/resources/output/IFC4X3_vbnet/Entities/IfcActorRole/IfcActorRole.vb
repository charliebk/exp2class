Public Class IfcActorRole
    Public Role As IfcRoleEnum
    Public UserDefinedRole As IfcLabel
    Public Description As IfcText

    ' === INVERSE CLAUSES ===
    ' HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects

    ' === WHERE CLAUSES ===
    ' WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR ((Role = IfcRoleEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedRole))
End Class
