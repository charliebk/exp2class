class IfcApplication:
    def __init__(self):
        self.ApplicationDeveloper: IfcOrganization = None
        self.Version: IfcLabel = None
        self.ApplicationFullName: IfcLabel = None
        self.ApplicationIdentifier: IfcIdentifier = None

    # === UNIQUE CLAUSES ===
    # UR1 : ApplicationIdentifier
    # UR2 : ApplicationFullName, Version
