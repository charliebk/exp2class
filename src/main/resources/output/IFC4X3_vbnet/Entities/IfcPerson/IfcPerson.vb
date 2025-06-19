Public Class IfcPerson
    Public Identification As IfcIdentifier
    Public FamilyName As IfcLabel
    Public GivenName As IfcLabel
    Public MiddleNames As List(Of IfcLabel)
    Public PrefixTitles As List(Of IfcLabel)
    Public SuffixTitles As List(Of IfcLabel)
    Public Roles As List(Of IfcActorRole)
    Public Addresses As List(Of IfcAddress)

    ' === INVERSE CLAUSES ===
    ' EngagedIn : SET [0:?] OF IfcPersonAndOrganization FOR ThePerson

    ' === WHERE CLAUSES ===
    ' IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName)
    ' ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName)
End Class
