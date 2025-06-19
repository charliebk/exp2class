from typing import List

class IfcProductRepresentation:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Representations: List[IfcRepresentation] = None

    # === EXTENDED BY ===
    # IfcMaterialDefinitionRepresentation
    # IfcProductDefinitionShape
