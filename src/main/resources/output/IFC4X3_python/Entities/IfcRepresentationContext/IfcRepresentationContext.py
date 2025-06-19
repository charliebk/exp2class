class IfcRepresentationContext:
    def __init__(self):
        self.ContextIdentifier: IfcLabel = None
        self.ContextType: IfcLabel = None

    # === EXTENDED BY ===
    # IfcGeometricRepresentationContext

    # === INVERSE CLAUSES ===
    # RepresentationsInContext : SET [0:?] OF IfcRepresentation FOR ContextOfItems
