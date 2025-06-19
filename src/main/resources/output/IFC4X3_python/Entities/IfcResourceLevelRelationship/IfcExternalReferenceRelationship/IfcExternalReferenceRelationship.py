class IfcExternalReferenceRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingReference: IfcExternalReference = None
        self.RelatedResourceObjects: SET [1:?] OF IfcResourceObjectSelect = None
