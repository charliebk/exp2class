class IfcExternalSpatialElement(IfcExternalSpatialStructureElement):
    def __init__(self):
        self.PredefinedType: IfcExternalSpatialElementTypeEnum = None

    # === INVERSE CLAUSES ===
    # BoundedBy : SET [0:?] OF IfcRelSpaceBoundary FOR RelatingSpace
