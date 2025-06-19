class IfcMaterialRelationship(IfcResourceLevelRelationship):
    def __init__(self):
        self.RelatingMaterial: IfcMaterial = None
        self.RelatedMaterials: SET [1:?] OF IfcMaterial = None
        self.MaterialExpression: IfcLabel = None
