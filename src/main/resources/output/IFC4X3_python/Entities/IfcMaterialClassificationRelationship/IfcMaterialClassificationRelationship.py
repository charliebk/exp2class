class IfcMaterialClassificationRelationship:
    def __init__(self):
        self.MaterialClassifications: SET [1:?] OF IfcClassificationSelect = None
        self.ClassifiedMaterial: IfcMaterial = None
