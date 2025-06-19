class IfcApproval:
    def __init__(self):
        self.Identifier: IfcIdentifier = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.TimeOfApproval: IfcDateTime = None
        self.Status: IfcLabel = None
        self.Level: IfcLabel = None
        self.Qualifier: IfcText = None
        self.RequestingApproval: IfcActorSelect = None
        self.GivingApproval: IfcActorSelect = None

    # === INVERSE CLAUSES ===
    # HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    # ApprovedObjects : SET [0:?] OF IfcRelAssociatesApproval FOR RelatingApproval
    # ApprovedResources : SET [0:?] OF IfcResourceApprovalRelationship FOR RelatingApproval
    # IsRelatedWith : SET [0:?] OF IfcApprovalRelationship FOR RelatedApprovals
    # Relates : SET [0:?] OF IfcApprovalRelationship FOR RelatingApproval

    # === WHERE CLAUSES ===
    # HasIdentifierOrName : EXISTS (Identifier) OR EXISTS (Name)
