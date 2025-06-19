Public Class IfcLibraryReference Inherits IfcExternalReference
    Public Description As IfcText
    Public Language As IfcLanguageId
    Public ReferencedLibrary As IfcLibraryInformation

    ' === INVERSE CLAUSES ===
    ' LibraryRefForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
End Class
