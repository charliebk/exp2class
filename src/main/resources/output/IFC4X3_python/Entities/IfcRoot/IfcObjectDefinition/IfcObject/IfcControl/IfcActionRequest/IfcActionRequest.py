class IfcActionRequest(IfcControl):
    def __init__(self):
        self.PredefinedType: IfcActionRequestTypeEnum = None
        self.Status: IfcLabel = None
        self.LongDescription: IfcText = None
