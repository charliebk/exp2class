class IfcRelCoversBldgElements(IfcRelConnects):
    def __init__(self):
        self.RelatingBuildingElement: IfcElement = None
        self.RelatedCoverings: SET [1:?] OF IfcCovering = None
