class IfcExternalReference:
    def __init__(self):
        self.Location: IfcURIReference = None
        self.Identification: IfcIdentifier = None
        self.Name: IfcLabel = None

    # === EXTENDED BY ===
    # IfcClassificationReference
    # IfcDocumentReference
    # IfcExternallyDefinedHatchStyle
    # IfcExternallyDefinedSurfaceStyle
    # IfcExternallyDefinedTextFont
    # IfcLibraryReference

    # === INVERSE CLAUSES ===
    # ExternalReferenceForResources : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatingReference

    # === WHERE CLAUSES ===
    # WR1 : EXISTS(Identification) OR EXISTS(Location) OR EXISTS(Name)
