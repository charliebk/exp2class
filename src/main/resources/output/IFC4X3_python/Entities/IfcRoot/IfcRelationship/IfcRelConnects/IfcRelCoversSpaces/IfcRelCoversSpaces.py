class IfcRelCoversSpaces(IfcRelConnects):
    def __init__(self):
        self.RelatingSpace: IfcSpace = None
        self.RelatedCoverings: SET [1:?] OF IfcCovering = None
