class IfcPhysicalQuantity:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None

    # === EXTENDED BY ===
    # IfcPhysicalComplexQuantity
    # IfcPhysicalSimpleQuantity

    # === INVERSE CLAUSES ===
    # HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    # PartOfComplex : SET [0:1] OF IfcPhysicalComplexQuantity FOR HasQuantities
