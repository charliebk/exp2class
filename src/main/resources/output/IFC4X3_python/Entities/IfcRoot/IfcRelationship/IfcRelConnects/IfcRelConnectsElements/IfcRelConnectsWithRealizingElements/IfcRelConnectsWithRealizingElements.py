class IfcRelConnectsWithRealizingElements(IfcRelConnectsElements):
    def __init__(self):
        self.RealizingElements: SET [1:?] OF IfcElement = None
        self.ConnectionType: IfcLabel = None
