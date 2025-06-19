from typing import List

class IfcReinforcementDefinitionProperties(IfcPreDefinedPropertySet):
    def __init__(self):
        self.DefinitionType: IfcLabel = None
        self.ReinforcementSectionDefinitions: List[IfcSectionReinforcementProperties] = None
