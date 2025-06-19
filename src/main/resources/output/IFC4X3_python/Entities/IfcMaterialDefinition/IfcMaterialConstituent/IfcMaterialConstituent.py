class IfcMaterialConstituent(IfcMaterialDefinition):
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Material: IfcMaterial = None
        self.Fraction: IfcNormalisedRatioMeasure = None
        self.Category: IfcLabel = None

    # === INVERSE CLAUSES ===
    # ToMaterialConstituentSet : IfcMaterialConstituentSet FOR MaterialConstituents
