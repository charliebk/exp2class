class IfcOrganizationRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingOrganization: IfcOrganization = None
        self.RelatedOrganizations: SET [1:?] OF IfcOrganization = None
