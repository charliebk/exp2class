class IfcAnnotation(IfcProduct):
    def __init__(self):
        self.PredefinedType: IfcAnnotationTypeEnum = None

    # === INVERSE CLAUSES ===
    # ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements
