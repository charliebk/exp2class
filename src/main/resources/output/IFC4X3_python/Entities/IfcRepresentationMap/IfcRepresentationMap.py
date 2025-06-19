class IfcRepresentationMap:
    def __init__(self):
        self.MappingOrigin: IfcAxis2Placement = None
        self.MappedRepresentation: IfcRepresentation = None

    # === INVERSE CLAUSES ===
    # HasShapeAspects : SET [0:?] OF IfcShapeAspect FOR PartOfProductDefinitionShape
    # MapUsage : SET [0:?] OF IfcMappedItem FOR MappingSource

    # === WHERE CLAUSES ===
    # ApplicableMappedRepr : 'IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(MappedRepresentation)
