class IfcBoundaryFaceCondition(IfcBoundaryCondition):
    def __init__(self):
        self.TranslationalStiffnessByAreaX: IfcModulusOfSubgradeReactionSelect = None
        self.TranslationalStiffnessByAreaY: IfcModulusOfSubgradeReactionSelect = None
        self.TranslationalStiffnessByAreaZ: IfcModulusOfSubgradeReactionSelect = None
