class IfcPermit(IfcControl):
    def __init__(self):
        self.PredefinedType: IfcPermitTypeEnum = None
        self.Status: IfcLabel = None
        self.LongDescription: IfcText = None
