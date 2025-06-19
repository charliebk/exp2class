class IfcBoundaryEdgeCondition(IfcBoundaryCondition):
    def __init__(self):
        self.TranslationalStiffnessByLengthX: IfcModulusOfTranslationalSubgradeReactionSelect = None
        self.TranslationalStiffnessByLengthY: IfcModulusOfTranslationalSubgradeReactionSelect = None
        self.TranslationalStiffnessByLengthZ: IfcModulusOfTranslationalSubgradeReactionSelect = None
        self.RotationalStiffnessByLengthX: IfcModulusOfRotationalSubgradeReactionSelect = None
        self.RotationalStiffnessByLengthY: IfcModulusOfRotationalSubgradeReactionSelect = None
        self.RotationalStiffnessByLengthZ: IfcModulusOfRotationalSubgradeReactionSelect = None
