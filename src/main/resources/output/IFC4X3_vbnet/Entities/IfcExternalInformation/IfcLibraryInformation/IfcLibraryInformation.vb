Public Class IfcLibraryInformation Inherits IfcExternalInformation
    Public Name As IfcLabel
    Public Version As IfcLabel
    Public Publisher As IfcActorSelect
    Public VersionDate As IfcDateTime
    Public Location As IfcURIReference
    Public Description As IfcText

    ' === INVERSE CLAUSES ===
    ' LibraryInfoForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
    ' HasLibraryReferences : SET [0:?] OF IfcLibraryReference FOR ReferencedLibrary
End Class
