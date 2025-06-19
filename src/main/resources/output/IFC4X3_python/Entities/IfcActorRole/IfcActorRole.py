class IfcActorRole:
    def __init__(self):
        self.Role: IfcRoleEnum = None
        self.UserDefinedRole: IfcLabel = None
        self.Description: IfcText = None

    # === INVERSE CLAUSES ===
    # HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects

    # === WHERE CLAUSES ===
    # WR1 : (Role <> IfcRoleEnum.USERDEFINED) OR ((Role = IfcRoleEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedRole))
