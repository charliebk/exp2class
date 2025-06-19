class IfcConversionBasedUnit(IfcNamedUnit):
    def __init__(self):
        self.Name: IfcLabel = None
        self.ConversionFactor: IfcMeasureWithUnit = None

    # === EXTENDED BY ===
    # IfcConversionBasedUnitWithOffset

    # === INVERSE CLAUSES ===
    # HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
