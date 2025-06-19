class IfcMaterial(IfcMaterialDefinition):
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Category: IfcLabel = None

    # === INVERSE CLAUSES ===
    # HasRepresentation : SET [0:1] OF IfcMaterialDefinitionRepresentation FOR RepresentedMaterial
    # IsRelatedWith : SET [0:?] OF IfcMaterialRelationship FOR RelatedMaterials
    # RelatesTo : SET [0:1] OF IfcMaterialRelationship FOR RelatingMaterial
