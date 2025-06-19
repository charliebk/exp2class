class IfcSectionReinforcementProperties(IfcPreDefinedProperties):
    def __init__(self):
        self.LongitudinalStartPosition: IfcLengthMeasure = None
        self.LongitudinalEndPosition: IfcLengthMeasure = None
        self.TransversePosition: IfcLengthMeasure = None
        self.ReinforcementRole: IfcReinforcingBarRoleEnum = None
        self.SectionDefinition: IfcSectionProperties = None
        self.CrossSectionReinforcementDefinitions: SET [1:?] OF IfcReinforcementBarProperties = None
