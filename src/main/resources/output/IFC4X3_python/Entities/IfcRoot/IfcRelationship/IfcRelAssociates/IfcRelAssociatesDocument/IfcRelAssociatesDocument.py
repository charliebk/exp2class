class IfcRelAssociatesDocument(IfcRelAssociates):
    def __init__(self):
        self.RelatingDocument: IfcDocumentSelect = None
