class IfcClassificationReference(IfcExternalReference):
    def __init__(self):
        self.ReferencedSource: IfcClassificationReferenceSelect = None
        self.Description: IfcText = None
        self.Sort: IfcIdentifier = None

    # === INVERSE CLAUSES ===
    # ClassificationRefForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    # HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
