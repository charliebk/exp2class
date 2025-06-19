class IfcResourceApprovalRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatedResourceObjects: SET [1:?] OF IfcResourceObjectSelect = None
        self.RelatingApproval: IfcApproval = None
