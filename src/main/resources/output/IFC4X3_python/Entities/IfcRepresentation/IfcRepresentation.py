class IfcRepresentation:
    def __init__(self):
        self.ContextOfItems: IfcRepresentationContext = None
        self.RepresentationIdentifier: IfcLabel = None
        self.RepresentationType: IfcLabel = None
        self.Items: SET [1:?] OF IfcRepresentationItem = None

    # === EXTENDED BY ===
    # IfcShapeModel
    # IfcStyleModel

    # === INVERSE CLAUSES ===
    # RepresentationMap : SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation
    # LayerAssignments : SET [0:?] OF IfcPresentationLayerAssignment FOR AssignedItems
    # OfProductRepresentation : SET [0:?] OF IfcProductRepresentation FOR Representations
