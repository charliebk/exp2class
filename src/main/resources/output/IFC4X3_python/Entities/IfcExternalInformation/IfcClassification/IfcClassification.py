from typing import List

class IfcClassification(IfcExternalInformation):
    def __init__(self):
        self.Source: IfcLabel = None
        self.Edition: IfcLabel = None
        self.EditionDate: IfcDate = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Specification: IfcURIReference = None
        self.ReferenceTokens: List[IfcIdentifier] = None

    # === INVERSE CLAUSES ===
    # ClassificationForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    # HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
