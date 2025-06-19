class IfcExtendedProperties(IfcPropertyAbstraction):
    def __init__(self):
        self.Name: IfcIdentifier = None
        self.Description: IfcText = None
        self.Properties: SET [1:?] OF IfcProperty = None

    # === EXTENDED BY ===
    # IfcMaterialProperties
    # IfcProfileProperties
