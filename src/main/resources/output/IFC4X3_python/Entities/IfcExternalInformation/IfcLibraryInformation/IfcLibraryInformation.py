class IfcLibraryInformation(IfcExternalInformation):
    def __init__(self):
        self.Name: IfcLabel = None
        self.Version: IfcLabel = None
        self.Publisher: IfcActorSelect = None
        self.VersionDate: IfcDateTime = None
        self.Location: IfcURIReference = None
        self.Description: IfcText = None

    # === INVERSE CLAUSES ===
    # LibraryInfoForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
    # HasLibraryReferences : SET [0:?] OF IfcLibraryReference FOR ReferencedLibrary
