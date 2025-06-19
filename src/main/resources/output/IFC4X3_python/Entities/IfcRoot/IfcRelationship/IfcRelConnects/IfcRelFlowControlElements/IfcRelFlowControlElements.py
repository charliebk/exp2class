class IfcRelFlowControlElements(IfcRelConnects):
    def __init__(self):
        self.RelatedControlElements: SET [1:?] OF IfcDistributionControlElement = None
        self.RelatingFlowElement: IfcDistributionFlowElement = None
