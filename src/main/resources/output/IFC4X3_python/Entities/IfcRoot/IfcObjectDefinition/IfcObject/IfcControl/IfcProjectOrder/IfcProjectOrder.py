class IfcProjectOrder(IfcControl):
    def __init__(self):
        self.PredefinedType: IfcProjectOrderTypeEnum = None
        self.Status: IfcLabel = None
        self.LongDescription: IfcText = None
