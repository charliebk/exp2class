class IfcRelDefinesByType(IfcRelDefines):
    def __init__(self):
        self.RelatedObjects: SET [1:?] OF IfcObject = None
        self.RelatingType: IfcTypeObject = None
