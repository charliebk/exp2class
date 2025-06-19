class IfcRelDefinesByObject(IfcRelDefines):
    def __init__(self):
        self.RelatedObjects: SET [1:?] OF IfcObject = None
        self.RelatingObject: IfcObject = None
