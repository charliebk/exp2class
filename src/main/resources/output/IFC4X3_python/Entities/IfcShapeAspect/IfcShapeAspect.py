from typing import List

class IfcShapeAspect:
    def __init__(self):
        self.ShapeRepresentations: List[IfcShapeModel] = None
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.ProductDefinitional: IfcLogical = None
        self.PartOfProductDefinitionShape: IfcProductRepresentationSelect = None

    # === INVERSE CLAUSES ===
    # HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
