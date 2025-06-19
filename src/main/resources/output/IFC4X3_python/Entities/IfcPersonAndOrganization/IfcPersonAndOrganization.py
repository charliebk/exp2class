from typing import List

class IfcPersonAndOrganization:
    def __init__(self):
        self.ThePerson: IfcPerson = None
        self.TheOrganization: IfcOrganization = None
        self.Roles: List[IfcActorRole] = None
