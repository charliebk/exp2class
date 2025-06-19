class IfcLibraryReference(IfcExternalReference):
    def __init__(self):
        self.Description: IfcText = None
        self.Language: IfcLanguageId = None
        self.ReferencedLibrary: IfcLibraryInformation = None

    # === INVERSE CLAUSES ===
    # LibraryRefForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
