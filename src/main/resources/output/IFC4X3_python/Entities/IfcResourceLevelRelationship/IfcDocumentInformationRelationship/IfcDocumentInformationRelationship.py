class IfcDocumentInformationRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingDocument: IfcDocumentInformation = None
        self.RelatedDocuments: SET [1:?] OF IfcDocumentInformation = None
        self.RelationshipType: IfcLabel = None
