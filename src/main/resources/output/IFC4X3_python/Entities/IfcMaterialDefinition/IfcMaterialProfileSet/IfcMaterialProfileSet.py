from typing import List

class IfcMaterialProfileSet(IfcMaterialDefinition):
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.MaterialProfiles: List[IfcMaterialProfile] = None
        self.CompositeProfile: IfcCompositeProfileDef = None
