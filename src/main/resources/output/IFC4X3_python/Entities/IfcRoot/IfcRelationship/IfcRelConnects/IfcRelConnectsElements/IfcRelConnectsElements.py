class IfcRelConnectsElements(IfcRelConnects):
    def __init__(self):
        self.ConnectionGeometry: IfcConnectionGeometry = None
        self.RelatingElement: IfcElement = None
        self.RelatedElement: IfcElement = None

    # === EXTENDED BY ===
    # IfcRelConnectsPathElements
    # IfcRelConnectsWithRealizingElements

    # === WHERE CLAUSES ===
    # NoSelfReference : RelatingElement :<>: RelatedElement
