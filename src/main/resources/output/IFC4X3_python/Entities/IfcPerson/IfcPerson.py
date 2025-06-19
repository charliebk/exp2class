from typing import List

class IfcPerson:
    def __init__(self):
        self.Identification: IfcIdentifier = None
        self.FamilyName: IfcLabel = None
        self.GivenName: IfcLabel = None
        self.MiddleNames: List[IfcLabel] = None
        self.PrefixTitles: List[IfcLabel] = None
        self.SuffixTitles: List[IfcLabel] = None
        self.Roles: List[IfcActorRole] = None
        self.Addresses: List[IfcAddress] = None

    # === INVERSE CLAUSES ===
    # EngagedIn : SET [0:?] OF IfcPersonAndOrganization FOR ThePerson

    # === WHERE CLAUSES ===
    # IdentifiablePerson : EXISTS(Identification) OR EXISTS(FamilyName) OR EXISTS(GivenName)
    # ValidSetOfNames : NOT EXISTS(MiddleNames) OR EXISTS(FamilyName) OR EXISTS(GivenName)
