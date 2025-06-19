class IfcDocumentInformation(IfcExternalInformation):
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Location: IfcURIReference = None
        self.Purpose: IfcText = None
        self.IntendedUse: IfcText = None
        self.Scope: IfcText = None
        self.Revision: IfcLabel = None
        self.DocumentOwner: IfcActorSelect = None
        self.Editors: SET [1:?] OF IfcActorSelect = None
        self.CreationTime: IfcDateTime = None
        self.LastRevisionTime: IfcDateTime = None
        self.ElectronicFormat: IfcIdentifier = None
        self.ValidFrom: IfcDate = None
        self.ValidUntil: IfcDate = None
        self.Confidentiality: IfcDocumentConfidentialityEnum = None
        self.Status: IfcDocumentStatusEnum = None

    # === INVERSE CLAUSES ===
    # DocumentInfoForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument
    # HasDocumentReferences : SET [0:?] OF IfcDocumentReference FOR ReferencedDocument
    # IsPointedTo : SET [0:?] OF IfcDocumentInformationRelationship FOR RelatedDocuments
    # IsPointer : SET [0:1] OF IfcDocumentInformationRelationship FOR RelatingDocument
