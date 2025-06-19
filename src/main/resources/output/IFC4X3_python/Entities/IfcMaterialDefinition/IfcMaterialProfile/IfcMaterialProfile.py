class IfcMaterialProfile(IfcMaterialDefinition):
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.Material: IfcMaterial = None
        self.Profile: IfcProfileDef = None
        self.Priority: IfcInteger = None
        self.Category: IfcLabel = None

    # === EXTENDED BY ===
    # IfcMaterialProfileWithOffsets

    # === INVERSE CLAUSES ===
    # ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles

    # === WHERE CLAUSES ===
    # NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
