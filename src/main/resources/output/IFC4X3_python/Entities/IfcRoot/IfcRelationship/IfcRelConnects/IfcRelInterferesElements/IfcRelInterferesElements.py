class IfcRelInterferesElements(IfcRelConnects):
    def __init__(self):
        self.RelatingElement: IfcInterferenceSelect = None
        self.RelatedElement: IfcInterferenceSelect = None
        self.InterferenceGeometry: IfcConnectionGeometry = None
        self.InterferenceType: IfcIdentifier = None
        self.ImpliedOrder: IfcLogical = None
        self.InterferenceSpace: IfcSpatialZone = None

    # === WHERE CLAUSES ===
    # NoSelfReference : RelatingElement :<>: RelatedElement
