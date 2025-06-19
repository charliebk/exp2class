class IfcDocumentReference(IfcExternalReference):
    def __init__(self):
        self.Description: IfcText = None
        self.ReferencedDocument: IfcDocumentInformation = None

    # === INVERSE CLAUSES ===
    # DocumentRefForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument

    # === WHERE CLAUSES ===
    # WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument)
