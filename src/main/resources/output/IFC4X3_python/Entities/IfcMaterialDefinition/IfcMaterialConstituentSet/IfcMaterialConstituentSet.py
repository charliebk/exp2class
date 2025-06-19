class IfcMaterialConstituentSet(IfcMaterialDefinition):
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.MaterialConstituents: SET [1:?] OF IfcMaterialConstituent = None
