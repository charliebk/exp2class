class IfcApprovalRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingApproval: IfcApproval = None
        self.RelatedApprovals: SET [1:?] OF IfcApproval = None
