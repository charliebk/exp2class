from typing import List

class IfcOrganization:
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Roles: List[IfcActorRole] = None
        self.Addresses: List[IfcAddress] = None

    # === INVERSE CLAUSES ===
    # IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
    # Relates : SET [0:?] OF IfcOrganizationRelationship FOR RelatingOrganization
    # Engages : SET [0:?] OF IfcPersonAndOrganization FOR TheOrganization
