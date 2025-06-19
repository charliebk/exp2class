class IfcSectionProperties(IfcPreDefinedProperties):
    def __init__(self):
        self.SectionType: IfcSectionTypeEnum = None
        self.StartProfile: IfcProfileDef = None
        self.EndProfile: IfcProfileDef = None
