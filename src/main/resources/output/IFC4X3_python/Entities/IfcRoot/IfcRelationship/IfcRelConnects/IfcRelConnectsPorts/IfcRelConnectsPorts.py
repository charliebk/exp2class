class IfcRelConnectsPorts(IfcRelConnects):
    def __init__(self):
        self.RelatingPort: IfcPort = None
        self.RelatedPort: IfcPort = None
        self.RealizingElement: IfcElement = None

    # === WHERE CLAUSES ===
    # NoSelfReference : RelatingPort :<>: RelatedPort
