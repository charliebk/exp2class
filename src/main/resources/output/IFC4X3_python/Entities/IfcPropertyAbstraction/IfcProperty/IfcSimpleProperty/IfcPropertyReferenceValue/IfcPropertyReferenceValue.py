class IfcPropertyReferenceValue(IfcSimpleProperty):
    def __init__(self):
        self.UsageName: IfcText = None
        self.PropertyReference: IfcObjectReferenceSelect = None
