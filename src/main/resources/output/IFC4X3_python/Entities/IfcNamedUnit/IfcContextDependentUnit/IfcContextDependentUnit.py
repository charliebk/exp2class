class IfcContextDependentUnit(IfcNamedUnit):
    def __init__(self):
        self.Name: IfcLabel = None

    # === INVERSE CLAUSES ===
    # HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
